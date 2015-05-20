/**
* program to print ThreadPriority
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package thread;

public class ThreadPriority {
	public static void main(String[] args) {
		// Define a task for threads
		Runnable task = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running and has a priority " + Thread.currentThread().getPriority());
				for(int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " is printing...");
					System.out.println("i = " + i);
				}
				System.out.println(Thread.currentThread().getName() + " is finishing...");
			}
		};
		
		Thread threadA = new Thread(task, "ThreadA");
		threadA.setPriority(Thread.MIN_PRIORITY);
		
		Thread threadB = new Thread(task,"ThreadB");
		threadB.setPriority(Thread.NORM_PRIORITY);
		
		Thread threadC = new Thread(task,"ThreadC");
		threadC.setPriority(Thread.MAX_PRIORITY);
		
		threadA.start();
		threadB.start();
		threadC.start();
	}
}
