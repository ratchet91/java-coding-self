package main;

public class ThreadEvenOdd {
	private int count = 1;
	private final static Object lock = new Object();
	int maxCount = 10;

	public void print(int threadId) {
		synchronized (lock) {
			while (count <= maxCount) {
				if (count % 2 == threadId) {
					System.out.println(" Thread with thread id : " + threadId + " is printing : " + count);
					count++;
					lock.notifyAll();
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}
			lock.notifyAll();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEvenOdd evenOdd = new ThreadEvenOdd();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				evenOdd.print(0);
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				evenOdd.print(1);
			}
		});

		t1.start();
		t2.start();

	}

}
