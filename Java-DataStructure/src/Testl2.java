
public class Testl2 {
public static void main(String[] args) {
	//case 1: 1,2,3,4,3,2,1
	//case 2: 0,4,5,12,17,10,
	//case 3: 0,4,5,12,17,10,5,1,13,2,0
	//case 4: 17 --- not at first and last
	
	int[] ar= {1,2,3,4,3,2,1};
	boolean m=Mount(ar);
	System.out.println(m);
	
	
	
  }
  public static boolean Mount(int[] ar) { 
	  int peek=0;
	  boolean flag=false;
	  int j=0;
	  for (int i = 0; i < ar.length-1; i++) {		  
		 
		  if(ar[i]>ar[i+i]) {
			  flag=false;
			  if(ar[i]>ar[i+1]) {
					flag=true;
				}
				else {
					flag=false;
				}
		  }else if(ar[i]<ar[i+1]) {
				flag=true;
			}
				/*
				 * peek=ar[i+1]; j=i+1;
				 */ // 2,3
				//if(i<j) { //
				  						
			}
	  return flag;
  }
}
