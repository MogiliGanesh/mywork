package java_Thread;

public class one {

	Thread t1 = new Thread() {
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread t1  " + t1.getName());
				System.out.println(i);
			}
		}
	};

	Thread t2 = new Thread() {
		public void run() {
			for (int i = 0; i < 9; i++) {
				System.out.println("Thread t2  " + t2.getName());
				System.out.println(i);
			}
		}

	};

	Thread t3 = new Thread() {
		public void run() {
			for (int i = 0; i < 13; i++) {
				System.out.println("Thread t3  " + t3.getName());
				System.out.println(i);
			}
		}
	};

	public void run() throws InterruptedException {
		t2.start();
		t2.join();
		System.out.println("priority  "+t2.getPriority());

		t1.start();
		System.out.println("priority  "+t1.getPriority());

		t3.start();
		System.out.println("priority  "+t3.getPriority());

	}

	public static class thread extends Thread {
		public static void main(String[] args) throws InterruptedException {
			one o = new one();
			o.run();

		}

	}
}