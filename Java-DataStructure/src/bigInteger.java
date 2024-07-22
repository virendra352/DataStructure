import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class bigInteger {
public static void main(String[] args) throws IOException{

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter first number");
    String a=br.readLine();
    System.out.println("enter Second number");
    String b=br.readLine();
    BigInteger ab=new BigInteger(a);
    BigInteger bb=new BigInteger(b);
    System.out.println(ab.add(bb));
    System.out.println(ab.multiply(bb));
}
}
