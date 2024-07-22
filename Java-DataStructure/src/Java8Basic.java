
public class Java8Basic {
public static void main(String[] args) {
	
	String st="Virendra";
	st.chars().peek(System.out::println).mapToObj(String::valueOf).peek(System.out::println).forEach(System.out::println);
	
	
}
}
