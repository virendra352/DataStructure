import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamtoMap {
	static void M() {
		 int i=18;
	}
public static void main(String[] args) {
	
	T t1=new T();
	System.out.println(T.t);
	
	 //int t;      
     //System.out.println(t); //t is not initialize
	//static int i=10;
     //System.out.println(i);
	//System.out.println(ConvertStreamtoMap.i);
	///System.out.println(new ConvertStreamtoMap().i);
	
	Stream<String> nameStream = Stream.of(
            "Rajiv",
            "Anbu",
            "Santosh",
            "Abdul",
            "Abdul",
            "Lingaraj"
            );
	
	HashMap<String, Integer> hmap = nameStream.collect(Collectors.toMap(Function.identity(),String::length,(key1,key2)->key1,HashMap::new));
	
	System.out.println(hmap);
	hmap.entrySet().stream().forEach(entry->System.out.println(entry.getKey() + " "+entry.getValue()));
	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	  // 1st argument, init value = 0
	  int sum = Arrays.stream(numbers).boxed().reduce(0, (a, b) -> a + b);
	  System.out.println(sum);
}
}
class T {
	  static int t = 20;
	  T() {
	    t = 40;
	  }
	}
 interface A{
	public abstract void run();
}
