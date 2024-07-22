import java.util.Optional;

class ABB extends Exception{
	//String message;
	/*
	 * public String toString() { return "Hello"; }
	 */
//	public String getMessage() {
//		return "hii..";
//	}
	ABB(String message){
		super();
		System.out.println(message);
	}
}
public class Demo {

	
	public static void main(String[] args)   {
		
	Optional<String> a=Optional.empty();   ///
	  try {		  
	   if(a.isPresent()) {    /// 16 nullpointerException
		   System.out.println(a.get());
		  //throw new ABB("name is same"); 
	   }else {
		   throw new ABB("Data is not present......"); 
	   }
	}catch (ABB s) {
		s.printStackTrace(); //
		System.out.println(s);  //
		System.out.println(s.toString());//
	  }	  
	}
	
	
}
