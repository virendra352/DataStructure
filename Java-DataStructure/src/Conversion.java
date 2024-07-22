import java.util.PriorityQueue;

public class Conversion {
public static void main(String[] args) {
	
	int a=1000;
	String intTostring=String.valueOf(a);
	System.out.println(intTostring);
	System.out.println(Integer.parseInt(intTostring));
	
	
	PriorityQueue<String> pq = new PriorityQueue<>();
	 
    pq.add("Geeks");
    pq.add("For");
    pq.add("Geeks");
    pq.offer("viru");
    pq.offer("virendre");

    System.out.println("Initial PriorityQueue " + pq);
}
}
