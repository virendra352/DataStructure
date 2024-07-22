package core.java.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CompletableFuture {
	public static void repeatMessage(String text, int count) {
		ExecutorService executor=Executors.newFixedThreadPool(10);
            for (int i = 0; i < count; i++) {
            	executor.execute(()->{
            		System.out.println(text+"  Runnable task is running : "+Thread.currentThread().getName());
            	});
            }
    }
public static void main(String[] args) {
	
	//why Completablefuture came in java 5 if we had already future API 
	//1. There is no way to complete the future. we can only attempt to cancel the task.
	//2. The get() method in the Future Interface is blocking operation
	//3. No support for exception handling
	//4. Multiple futures cannot be chained together.
	
	String middlename = "V";
	ExecutorService executor=Executors.newFixedThreadPool(10);

	Future<String> futur=executor.submit(()->{		
		String threadname=Thread.currentThread().getName();
		return "Service has been executed : "+threadname;
	});
	String result = null;
	
		try {
			 result = futur.get(20,TimeUnit.SECONDS);
		} catch (InterruptedException|ExecutionException |TimeoutException e) {
			e.printStackTrace();
		}
	    System.out.println(result);    
	    
	    repeatMessage("Hello", 15); 
	    
}
	
}
