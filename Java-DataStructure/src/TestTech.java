import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestTech {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("aa");
	l.add("bb");
	l.add("aa");


	HashSet<String> set=new HashSet<>();
	set.addAll(l);
	System.out.println(set);
}
}
