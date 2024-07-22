import java.util.concurrent.atomic.AtomicInteger;
class Thread1 extends Thread{
	VolatileAtomic v;

	public Thread1(VolatileAtomic v) {
		super();
		this.v = v;
	}
	
	public void run() {
		v.getValue();
	}
}

class Thread2 extends Thread{
	VolatileAtomic v;

	public Thread2(VolatileAtomic v) {
		super();
		this.v = v;
	}
	public void run() {
		v.getValue();
	}
}

public class VolatileAtomic {
	//private final AtomicInteger a=new AtomicInteger(0);
	int count=0;
	 int getValue() {
		 return count++;
	 }
	 
  public static void main(String[] args) {
	  VolatileAtomic v=new VolatileAtomic();
	  Thread1 t1=new Thread1(v);
	  Thread2 t2=new Thread2(v);
	  t1.start();
	  t2.start();
	  
	  System.out.println(v.getValue());
}
}
