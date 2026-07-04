
class AA {
	int b=10;
   public void Showdetails(){
    System.out.println("Show the data of class A");
  }
}
class B extends AA{

  public void Showdetails(){
    System.out.println("Show the data of class B");
  }
}

class C extends B  {
  int b=11;
  public void Showdetails(){
    System.out.println("Show the data of override class c1");
  }
  public void Showdetails1(){
	    System.out.println("Show the data of class c1");
	  }
}
class Test{
	 public static void main(String[] args){
    AA a=new C();
    a.Showdetails(); ///
          System.out.println(a.b);  //why printing 10 not 11
     
    //a.Showdetails1(); //why error
    C c=new C();
    //c. 2 show method will be accessible
    c.Showdetails();
    c.Showdetails1();
    System.out.println(c.b+" "+c.b);
  }
}
