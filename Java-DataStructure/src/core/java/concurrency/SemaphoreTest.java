package core.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class SemaphoreTest implements Runnable {
	@Override
	public void run() {
	System.out.println("Running task"+Thread.currentThread().getName());
		
	}
public static void main(String[] args) {
	
	ExecutorService executor=Executors.newFixedThreadPool(50);
	
	IntStream.of(1000).forEach(i-> executor.execute(new SemaphoreTest()));
}
}
