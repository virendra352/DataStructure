import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInter {
public static void main(String[] args) {
	
           Function<Integer,Integer> f=(t)->t*3; 
           Function<Integer,Integer> f1=(t)->t*t*t;
           System.out.println(f.apply(5)); // 5*3= 25 //this is simple function which takes an any type argument and returns any type
           Function<Integer, Integer> andThen = f.andThen(f1);   //1st function will be applied before 2nd function is performed
           System.out.println(andThen.apply(2)); //2*3=6 then 6*6*6=216
           //compose method is just reverse of andThen function
           System.out.println(f.compose(f1).apply(4)); //4*4*4=64 then 64*3= 192
           
           
           HashMap<Integer, String> hm=new HashMap<>();
           hm.put(100, "Vikas");
           hm.put(101, "Viru");
           hm.put(102, "Patel"); 
           hm.put(103, "Vimal");
           long first=System.currentTimeMillis();
           hm.entrySet().stream().forEach(t->System.out.println(t.getKey() + " "+t.getValue()));
           long sec=System.currentTimeMillis();
           System.out.println(sec-first);
           long first1=System.currentTimeMillis();
           hm.forEach((i1,i2)->System.out.println(i1 + " "+i2));
           long secc=System.currentTimeMillis();
           System.out.println(secc-first1);
           
           List<Entry<Integer, String>> list = hm.entrySet().stream().collect(Collectors.toList());
           System.out.println(list);
           System.out.println("sorted by key");
           hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(t->System.out.println(t.getKey()));
           //hm.entrySet().stream().sorted().
           
           
           
}
}
