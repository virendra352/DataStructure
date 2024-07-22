import java.util.ArrayList;
import java.util.List;

class Testsafe{
	public void show(int a) {
		System.out.println("show int");
	}
	public void show(float a) {
		System.out.println("show float");
	}
	public void show(Object a) {
		System.out.println("show Object");
	}
	public void show(String a) {
		System.out.println("show String");
	}
	
	
}
public class Typesafe {
@SuppressWarnings({ "unchecked", "removal" })
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	ArrayList al =new ArrayList(); 
    al.add("Vivek Yadav"); 
    al.add("Raviiiii"); 
    al.add(new Integer(10)); 
    al.forEach(s->System.out.println(s));
    
    Testsafe t=new Testsafe();
    t.show(10000);
    t.show("viren");
    t.show(20.05f);
    t.show(null);
    String p=null;
    t.show(new Integer(10));
    //t.show();
    List<String> l=new ArrayList();
    l.add("Vivek tiwari"); 
    l.add("Raviiiii");
     String[] array = l.toArray(new String[0]);
    l.forEach(s->System.out.println(s));
}
}
