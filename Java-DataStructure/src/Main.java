import java.util.ArrayList;

import com.java.DataStructure.algorithms.linkedList.main;

public class Main {
	 
public static void main(String[] args) {
	ArrayList<Integer> numbersList = new ArrayList<>();
    Integer input1=10;
    Integer input2=20;
    for (int i = 1; i <= 10; i++) {
        numbersList.add(i);
    }
    numbersList.removeIf(num -> num % 2 == 0);  
    numbersList.add(0,input1 );
    numbersList.add(numbersList.size(), input2);
    
    for(int i:numbersList) {
    	System.out.print(i +" ");
    }
}
}
