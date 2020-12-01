package thread;

public class SleepTest {
	public static void main(String[] args) {
		Thread thread = new Thread("t1线程"){
			@Override
			public void run() {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		System.out.println(thread.getState());
		thread.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println(thread.getState());
		}
	}
}
