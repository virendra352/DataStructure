import java.util.HashMap;

public class PairSum {
 public static void main(String[] args) {
	 int [] ar= {1,2,3,3,4,4,5,5,6,6,7,7,8,9,9};
			 

			 int sum=10;
			 HashMap<Integer,Integer> hm=new HashMap<>();
			 for(int i=0;i<ar.length;i++){
			     for(int j=i+1;j<ar.length-1;j++){
			         if(ar[i]+ar[j]==sum){
			         hm.put(ar[i],ar[j]);  
			      }      
			 }
			 }
			 hm.forEach((a,b)->{
				 System.out.println(a+","+b);
			 });
			 }
}
