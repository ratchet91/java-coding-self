package test123;

public class Test1 {
	// volatile int count = 0;
	private final Object lock = new Object();
	private int count = 1;
	private static final int maxCount = 10;

	public void printNumbers(int threadId) {
		synchronized (lock) {
			while (count <= maxCount) {
				if (count % 2 == threadId) {
					System.out.println("Thread " + threadId + " : " + count);
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
		Test1 t3 = new Test1();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				t3.printNumbers(1);
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				t3.printNumbers(0);
			}
		});

		t1.start();
		t2.start();
	}

}

//syncronisation -> for wait
