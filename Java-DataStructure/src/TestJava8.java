import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestJava8 {
	public static void main(String[] args) {
	IntStream a = IntStream.of(1,2,3,4,5,6,7,8); //java8
	List<Integer> b=Arrays.asList(10,20,31,40,57,60,70,80,20,57); //before java8
	     //find out the even number
	     System.out.println("--------------even number--------------------------");
	     b.stream().filter(n->n%2==0).forEach(System.out::println);
	     //find out number starting with 1
	     System.out.println("--------------starting with 1--------------------------");
	     b.stream().map(n->n.toString()).filter(n->n.startsWith("1")).forEach(System.out::println);
	     //duplicate number
	     System.out.println("----------------duplicate number------------------------");
	     Map<Integer,Long> c=b.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	     c.forEach((K,V) -> System.out.println(K + ", Stock : " + V));
	     c.entrySet().forEach(k->{
	    	 if(k.getValue()>1) {
	    		System.out.println("Duplicate values---"+k.getKey()); 
	    	 }
	     });
	     
	     b.stream().filter(x->x%2==0).
	     
	     
	     
	
}	
}
