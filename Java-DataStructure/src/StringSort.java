
public class StringSort {
	
	static String Sort(String s){
        char[] c=s.toCharArray();
    
    for (int i = 0; i < c.length; i++) {
        for (int j = i; j < c.length; j++) {
            if(c[i]>c[j]) {
                char t=c[i];
                c[i]=c[j];
                c[j]=t;
            }
        }
    }
    String st=new String(c);
    return st;
    }
    static boolean isAnagram(String a, String b) {
        String A=Sort(a);
        String B=Sort(b);
        if(A.length()==B.length()){
            if(A.equals(B)){
               return true; 
            }
        }else{
            return false;
        }
		return false; 
    }
public static void main(String[] args) {
	//anagram
	//margana
	boolean ret = isAnagram("anagram", "margana");
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
 }
}
