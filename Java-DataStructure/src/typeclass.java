
public class typeclass<T> {

	T a;
	public T getData(T a) {
		return a;
	}
	
	public static void main(String[] args) {
		 typeclass<String> r=new typeclass<>();
		 typeclass<Integer> r1=new typeclass<>();
		 System.out.println(r.getData("Virendra"));
		 System.out.println(r1.getData(100));
	}
	
}
