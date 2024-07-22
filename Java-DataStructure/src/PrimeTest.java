import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class PrimeTest {
public static void main(String[] args) {
	
	int n=13;
	boolean flag = false;
	for(int i=2;i<n;i++) {
		flag=true;		
		if(n%i==0) {
			flag=false;
			break;
		}
	}
	if(flag) {
		System.out.println("prime");
	}else {
		System.out.println("not prime");
	}
	int[] ar= {1,2,3,4,5,6}; 
	int[] arr= {1,2,3,4,5,6}; 
	Stream<Integer> con = Stream.concat(Arrays.stream(ar).boxed(), Arrays.stream(arr).boxed());
}
}
