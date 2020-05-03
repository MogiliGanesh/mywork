package java_Thread;

public class Multi_Thread extends Thread {

	public void run() {
		System.out.println("java run method");
		
		for (int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {

		Multi_Thread mt1=new Multi_Thread();
		Multi_Thread mt2=new Multi_Thread();
		Multi_Thread mt3=new Multi_Thread();
		mt1.start();
	//	mt1.join();   // waits till thread dies
		System.out.println(mt1.getName());
		mt3.start();
		System.out.println(mt1.getName());
		mt2.start();
		System.out.println(mt1.getName());
		
		
	}

}



