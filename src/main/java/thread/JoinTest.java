package thread;

public class JoinTest {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread("线程1") {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		};
		Thread thread2 = new Thread("线程2") {
			public void run() {
				try {
					thread1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			};
		};
		thread1.start();
		thread2.start(); 
		Thread.sleep(500);
		System.out.println(thread2.getState());
	}
}
