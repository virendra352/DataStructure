package core.java.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFuture1 {
public static void main(String[] args) {
	
	//single asynchronous call
	CompletableFuture<String> future=CompletableFuture.supplyAsync(()->{
		return "Hello future"+Thread.currentThread().getName();
	});
	
	future.thenAccept(result->System.out.println(result));
	
	//multiple asynchronous call
	long a=System.currentTimeMillis();
	//ExecutorService e=Executors.newCachedThreadPool();
	CompletableFuture<Integer> future1=CompletableFuture.supplyAsync(()->10)
			.thenApplyAsync(t->t*2)
			.thenApplyAsync(t->t+10);
	 
	future1.thenAccept(result->System.out.println(result));
	long b=System.currentTimeMillis();
	
	System.out.println(b-a);
			
}
}
