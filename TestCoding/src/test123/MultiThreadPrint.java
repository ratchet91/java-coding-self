package test123;

public class MultiThreadPrint extends Thread {
	static int count = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			printNum();
		}

	}

	public void printNum() {

		try {
			synchronized (this) {
				if (count % 2 == 0) {
					notifyAll();
					System.out.println("thread" + Thread.currentThread().getName() + "count : " + count);
					count++;
				}

				wait();
				System.out.println("thread" + Thread.currentThread().getName() + "count : " + count);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();

	}

}
