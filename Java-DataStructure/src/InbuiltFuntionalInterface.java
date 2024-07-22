import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuiltFuntionalInterface {
public static void main(String[] args) {
	
	//consumer interface
	//  void accept(T t);
	
	//predicate Interface
	// boolean Test(T t);
	
	//Supplier Interface
	//  T get();
	
	Consumer<Integer> ref=(t)->{
		System.out.println(t*t);
	};
	ref.accept(20);
	
	Predicate<Integer> reff=(t)->{
		if(t%2==0) {
			System.out.println("Even Number");
			return true;
		}
		return false;
	};
	System.out.println(reff.test(4));
	
	Supplier<Integer> refff=()->3*4;
	
	System.out.println(refff.get());
	
	
	
 	
}
}
