import java.util.Optional;

public class OptionalClass {
public static void main(String[] args) {
	
	Optional<Object> of = Optional.of("uyuy");
	  if(of.isPresent()) {
		  System.out.println("Data is present ");
	  };
	  
	  Optional<Object> off = Optional.ofNullable(null);
	  if(off.isPresent()) {
		  System.out.println("Data is present ");
	  }else{
		  System.out.println("Data is not present");
	  };
}
}
