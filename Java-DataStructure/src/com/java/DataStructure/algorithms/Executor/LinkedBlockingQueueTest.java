package com.java.DataStructure.algorithms.Executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> linkedBlockingQueueTest =new LinkedBlockingQueue<>(5);

        new Thread(()->{
            int i=0;
            try{
            while(true){

                    linkedBlockingQueueTest.add(++i);
                    System.out.println("Inserted . "+i);
                    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            }
                } catch (InterruptedException e) {
                    System.out.println("Inserted queue is blocked...");;
                }
        }).start();
        new Thread(()->{
            try{
            while(true) {


                Integer a = linkedBlockingQueueTest.take();
                System.out.println("Pulled. " + a);
                Thread.sleep(TimeUnit.SECONDS.toMillis(20));
            }
                } catch (InterruptedException e) {
                    System.out.println("Pulled queue is blocked...");;
                }

        }).start();

    }
}
