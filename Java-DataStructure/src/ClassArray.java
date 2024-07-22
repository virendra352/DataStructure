import java.util.Arrays;

public class ClassArray {
public static void main(String[] args) {
	int[] ar= {1,2,3,4,5,6};   //rotation clockwise by 1 iteration // 6 1 2 3 4 5
	int n=1; //Iteration
	int tem=ar[ar.length-1];
	for (int i =ar.length-1-n; i>=0; i--) {
		ar[i+1]=ar[i];		
	}
	ar[0]=tem;
	
	System.out.println(Arrays.toString(ar));
	System.out.println("==========================");
	String s="";
	
	if(s!=null) {
		if(s.isEmpty()) {
		System.out.println("same");
		}
	}else {
		System.out.println("not same");
	}
	if(s.equals("d")) {
		System.out.println("dddddd");
	}
	
}
}
