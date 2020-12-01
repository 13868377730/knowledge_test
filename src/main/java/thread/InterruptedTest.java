package thread;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class InterruptedTest {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread() {
			public void run() {
				System.out.println("线程1开始");
				try {
					sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("线程1结束");
			}
		};
		thread1.start();
		Thread.sleep(500);
		thread1.interrupt();
	}
}
