
public class integerTest {
	public void show(int i,int j) {
		System.out.println("int");
	}
	public void show(Integer i,Integer j) {
		System.out.println("integer");
	}
	public void show(String s) {
		System.out.println("String");
	}
	public void show(Object s) {
		System.out.println("Object");
	}
	public void show(int s) {
		System.out.println("int Object");
	}
	
public static void main(String[] args) {
	integerTest t=new integerTest();
	t.show(3, 5);
	t.show(new Integer(5), new Integer(5));
	t.show(null);
	t.show(new Integer(7));
	t.show(new String("vvvvvv"));
	String ss=new String("vvvvvvvv");
	t.show(3);
	
 }
}
