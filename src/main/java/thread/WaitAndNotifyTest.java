package thread;

import bean.Student;

public class WaitAndNotifyTest {
	public static void main(String[] args) throws InterruptedException {
		Student student = new Student();
		Thread thread1 = new Thread("线程一") {
			@Override
			public void run() {
				synchronized (student) {
					for (int i = 0; i < 10; i++) {
						if (i==5) {
							try {
								student.notify();
								student.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println(this.getName()+i);
					}
				student.notify();
				}
			}
		};
		Thread thread2 = new Thread("线程二") {
			@Override
			public void run() {
				synchronized (student) {
					for (int i = 11; i < 20; i++) {
						if (i==15) {
							try {
								System.out.println(thread1.getState());
								student.notify();
								System.out.println(thread1.getState());
								student.wait();
								System.out.println(thread1.getState());
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println(this.getName()+i);
					}
				}
			}
		};
		thread1.start();
		thread2.start();
		Thread.sleep(500);
	}
}
