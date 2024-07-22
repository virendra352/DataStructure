package core.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FuterClass implements Runnable{
	@Override
	public void run() {
		System.out.println("Task is running now");		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<5;i++) {
			System.out.println("Data are : "+i);
		}
	}
public static void main(String[] args) {
	// Future is interface 
	//it is used to store the computation of result for Asynchronous execution
    // Methods are  1) boolean  isDone(), 2) boolean isCancelled(),3) V get(); 4) boolean cancel()
	
	//Executor is also interface 
	//it has only one execute method void execute(Runnable command);
	
	//executorservice is also interface and it extends the executor interface 
	// methods are : 1) future<T> submit(collable<T> task) 2) shutdown() ;3) future<?> Submit(runnable )  4) 
	//future<T> submit(runnable task ,T result)
	
	ExecutorService execnutor=Executors.newFixedThreadPool(2);
 }
}
