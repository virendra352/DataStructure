package com.java.DataStructure.algorithms.Executor;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;


public class PriorityQueueTest {

   static class intComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Integer i=(Integer)o1;
            Integer i1=(Integer)o2;
            if(Objects.equals(i, i1))
                return 0;
            else if(i>i1)
                return 1;
            else
                return -1;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();//new intComparator());
        priorityQueue.add(1000);
        priorityQueue.add(100);
        priorityQueue.add(10);
        priorityQueue.add(900);
        priorityQueue.add(250);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());


    }
}
