import java.util.ArrayList;
import java.util.Arrays;
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
    /*public void show(Integer a) {
        System.out.println("show String");
    }*/   // t.show(null); it's ambiguous method show(String a) ,show(Integer a)
	
	
}
public class Typesafe {
@SuppressWarnings({ "unchecked", "removal" })
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
    ArrayList list = new ArrayList();  // Raw type
    list.add("Hello");
    list.add(123);  // Allowed, no error at compile time

    String s1 = (String) list.get(0); // OK
    //String s2 = (String) list.get(1); // Runtime error: ClassCastException
    
    Testsafe t=new Testsafe();
    t.show(10000); //show int
    t.show("viren"); //show string
    t.show(20.05f); //show float
    t.show(null);  //show string
    String p= "abc";// or  new String("abc")
    t.show(new Integer(10)); //show Object
    t.show(p);   //show string



    List<String> l=new ArrayList();
    l.add("Vivek tiwari"); 
    l.add("Raviiiii");
     String[] array = l.toArray(new String[0]);
    // Object[] array1 = l.toArray();

    String[] array2 = l.toArray(new String[2]);
    System.out.println(array2);
    Arrays.stream(array2).forEach(s->System.out.println(s));
}
}
