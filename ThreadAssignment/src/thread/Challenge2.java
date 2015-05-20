/**
* program to use isAlive() and print 1 to 10 using user defined Thread class
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package thread;

public class Challenge2 {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread("my extending thread");
		while (thread.isAlive()) {
			System.out.println("Main thread will be alive till the child thread is live");
			Thread.sleep(1);
		}
		System.out.println("Main thread's run is over");
	}
}

class MyThread extends Thread {

	public MyThread(String threadName) {
		super(threadName);
		System.out.println("my thread created" + this);
		start();
	}

	@Override
	public void run() {
		for (int count = 0; count < 10; count++) {
			System.out.println("Printing the count " + count);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// Never happen..
				e.printStackTrace();
			}
		}
		System.out.println("My thread run is over.");
	}
}
