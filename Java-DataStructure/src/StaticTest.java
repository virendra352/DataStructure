
 class StaticTest {
	public static Employee e=new Employee(2444,"df","ghjdg","gdh");
	
	public String get() {	
		return StaticTest.e.getName();
	}
public static void main(String[] args) {
	StaticTest a=new StaticTest();
	System.out.println(a.get());
	//new SubClass().setName("Mahesh");
	 new SubClass().display();
}
 }
  class SuperClass{
	   protected String name;
	   protected void setName(String name) { 
		      System.out.println("parent class");
		   }
	}
 class SubClass extends SuperClass {
	   private String name;
	   private  void setName(String name) { 
	      System.out.println("subclass");
	   }
	   public void display() {
	      System.out.println("name: "+name);
	   }
	   
	}

