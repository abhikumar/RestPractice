package LockDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//URL For Lock
//http://www.concretepage.com/java/reentrantlock-java-example-with-lock-unlock-trylock-lockinterruptibly-isheldbycurrentthread-and-getholdcount
public class Main {
	public static void main(String[] args) {
		final int threadCount = 5;
		final ExecutorService service = Executors.newFixedThreadPool(threadCount);
		//final Task task = new LockUnlockDemo();
		//Try lock example
		//final Task task = new TryLockDemo(); 
		//Lock interuptabilty example
		final Task task = new LockInterruptiblyDemo();
		for (int i=0; i< threadCount; i++) {
			service.execute(new Worker(task));
		}
		service.shutdown();
	}
} 
