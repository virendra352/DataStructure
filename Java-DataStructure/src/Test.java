
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
  int a=10;
  public void Showdetails(){
    System.out.println("Show the data of override class c1");
  }
  public void Showdetails1(){
	    System.out.println("Show the data of class c1");
	  }
}
class Test{
	 public static void main(String[] args){
		 int[] ar= {12,15,29,46,26,34,68};

        System.out.println(ar[1]);
    AA a=new C();
    //a.Showdetails(); ///
     
    //a.Showdetails1();
    C c=new C();
    //c. 2 show method will be accessible
    c.Showdetails();
    c.Showdetails1();
    System.out.println(c.a+" "+c.b);
  }
}
