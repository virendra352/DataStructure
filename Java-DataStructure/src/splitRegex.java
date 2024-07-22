import java.util.Arrays;

public class splitRegex {
public static void main(String[] args) {
	String ss="He is a very very good boy, isn't he?";
	String s="Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
	String s1="Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!  May be this case won't help you to find the   buuuuuug";
	String s2="           YES      leading spaces        are valid,    problemsetters are         evillllll";
	String s4="";
	//String n=s1.replaceAll("[,!]", "");
	//System.out.println(n);
	if(s4.isEmpty() || s4==null) {
		System.out.println(0);
		return;
	}
	String reg = "[^a-zA-Z]+"; //!,?._'@]
	String[] split = s2.trim().split(reg);
	System.out.println(Arrays.toString(split));
	System.out.println(split.length);
	for(String a:split) {
		if(!a.isEmpty()) {
		System.out.println(a.trim());
		}	
	}
}
}
