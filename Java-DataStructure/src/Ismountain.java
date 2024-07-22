import java.util.Iterator;

import com.java.DataStructure.algorithms.linkedList.main;

public class Ismountain {
public static void main(String[] args) {
	
	//int[] arr= {2,3,4,5,3,1};
	int[] arr= {8,7,6,5,3,1};
	int left=0;
	int right=arr.length-1;
	for (int i = 0; i < arr.length-1; i++) {	
		if(arr[i]<arr[i+1]) {
			left++;
		}
	}
	System.out.println("peek of mountain: "+arr[left]);
	for(int j=left;j<arr.length;j++) {
		if(right>1&&arr[right]<arr[right-1]) {
			right--;
		}
	}

	if(right==left) {
		System.out.println("Array is mountain");
	}else {
		System.out.println("Array is not a mountain");
	}
}
}
