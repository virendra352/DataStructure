import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JAVA8PROGRAM {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	List<Employee>ss=new ArrayList();
	  
	  ss.add(new Employee(30000,"VIKAS","VAISHALI","HR"));
	  ss.add(new Employee(50000,"VISHAL","NOIDA","DEVELOPER"));
	  ss.add(new Employee(28000,"AJAY","DELHI","TESTER"));
	  ss.add(new Employee(80000,"RAM","JAIPUR","DEVELOPER"));
	  ss.add(new Employee(50000,"RAHUL","DELHI","HR"));
	  ss.add(new Employee(25000,"AJAY","JAIPUR","TESTER"));
	  ss.add(new Employee(28000,"RAHUL","PUNE","FINANCE"));
	  
	  //WAP to find highest salary of an employee from each department
	  System.out.println("-----------------1------------------------");
	  Map<String, Optional<Employee>> mapobj = ss.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	  mapobj.entrySet().forEach(s->System.out.println(s.getKey()+" and highest salary is : "+s.getValue().get().getSalary()));
	  
	  //WAP to find max/min salary of an Employee
	  System.out.println("-----------------2------------------------");
	  Integer i = ss.stream().map(s->s.getSalary()).max((a,b)->a-b).get();
	  System.out.println(i);
	  
	  System.out.println("-----------------3------------------------");
	  Integer i1 = ss.stream().map(s->s.getSalary()).min((a,b)->a-b).get();
	  System.out.println(i1);
	  
	  System.out.println("-----------------4------------------------");
	  Integer max = ss.stream().map(s->s.getSalary()).max((a,b)->a-b).get();
	  System.out.println(max);
	  
      //WAP to find details of an employee who has max and min salary
	  System.out.println("-----------------5------------------------");
	  Employee employee = ss.stream().max(Comparator.comparing(Employee::getSalary)).get();
	  System.out.println("employe details are : "+employee.name+" "+employee.salary+" "+employee.department);
	  
	  //WAP to find occurrence of name in Employee list
	  System.out.println("-----------------6------------------------");
	  ss.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting())).entrySet()
	  .forEach(s->System.out.println(s.getKey()+" and "+s.getValue()));
	  
	  //WAP to find occurrence of salary of an Employee list
	  System.out.println("-----------------7------------------------");
	  ss.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting())).entrySet()
	  .forEach(s->System.out.println(s.getKey() + " "+ s.getValue()));
	  
	  //WAP to find average salary of an Employee list
	  System.out.println("-----------------8------------------------");
	  Double avg= ss.stream().collect(Collectors.averagingInt(Employee::getSalary));
	  System.out.println(avg);
	  
	  //WAP to find occurrence of character in an String
	  System.out.println("-----------------9------------------------");
	  String st="google";
	  Stream.of(st.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet()
	  .forEach(s->System.out.println(s.getKey() +" "+s.getValue()));
	  
	  //WAP to find second highest salary from an Employee list
	  System.out.println("-----------------10------------------------");
	  Integer maxs=ss.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(s->s.getSalary()).skip(1).findFirst().get();
	  System.out.println(maxs);
	  
	  //WAP to find duplicate element in an String
	  System.out.println("-----------------11------------------------");
	  Stream.of(st.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
	  .forEach(s->{
		  if(s.getValue()>1)
			  System.out.println(s.getKey());
	  });
	  
	  //WAP to find first non-Repeative element
	  System.out.println("-----------------12------------------------");
	  Stream.of(st.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	  .entrySet().stream().filter(s->s.getValue()==1L).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
	  

	  //WAP to find occurrence of word in an string
	  System.out.println("-----------------13------------------------");
	  String s="tit for tit";
	  
	  Stream.of(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	  .entrySet().forEach(t->System.out.println(t.getKey()+" "+t.getValue()));
	  
	  //WAP to find reverse each word in string
	  System.out.println("-----------------14------------------------");
	  Stream.of(s.split(" ")).map(t->new StringBuffer(t).reverse()).forEach(System.out::println);
	  
	  //WAP to find second highest number in array
	  System.out.println("-----------------15------------------------");
	  int[] ar= {12,15,29,46,26,34,68};
	  //WAP to find the sum of all element of array
	  System.out.println("-----------------16------------------------");
	  Integer sumreduce = Arrays.stream(ar).boxed().reduce(0,(a,b)->a+b);
	  System.out.println(sumreduce);
	  
	  System.out.println("-----------------17------------------------");
	  IntStream m= IntStream.of(12,15,29,46,26,34,68);
	  IntStream.range(1, 10); //second parameter is exclusive
	  IntStream.rangeClosed(1, 10);  //Both parameter are inclusive
	  System.out.println("-----------------18------------------------");
	  Arrays.stream(ar).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
	  int sum=Arrays.stream(ar).sum();
	  System.out.println(sum);
	  System.out.println("-----------------19------------------------");
	  boolean flag=Arrays.stream(ar).isParallel();
	  System.out.println(flag);
	  
	  System.out.println("-----------------20------------------------");
	  Arrays.stream(ar).parallel().forEach(System.out::println);
	  
	  System.out.println("-----------------21------------------------");
	  Arrays.stream(ar).boxed().sorted().skip(Arrays.stream(ar).boxed().count()-1).findFirst().ifPresent(System.out::println);
	  
	  System.out.println("-----------------22------------------------");
	  Long count=Arrays.stream(ar).boxed().count();
	  System.out.println(count);
	  
	  //WAP to find number start with 1
	  System.out.println("-----------------23------------------------");
	  Arrays.stream(ar).boxed().map(t->t.toString()).filter(t->t.startsWith("1")).forEach(System.out::println);
	  
	  //WAP to sort the employee on the basis of salary
	  System.out.println("-----------------24------------------------");
	  ss.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(t->System.out.println(t));;

      //WAP to find employee who are working in HR department
	  System.out.println("-----------------25------------------------");
	  ss.stream().filter(t->t.getDepartment().equalsIgnoreCase("HR")).forEach(System.out::println);
	  
	  //WAP to find even and odd number
	  System.out.println("-----------------26------------------------");
	  Arrays.stream(ar).boxed().filter(t->t%2==0).forEach(System.out::println);
	
	  Arrays.stream(ar).boxed().filter(t->t%2!=0).forEach(System.out::println);
	  
	  //WAP to find reverse a string
	  System.out.println("-----------------27------------------------");
	  StringBuffer revs = Stream.of(st).map(t->new StringBuffer(t).reverse()).findFirst().get();
	  System.out.println(revs);
	  
	 //WAP to find largest string in an Array
	  System.out.println("-----------------28------------------------");
	  String[] str= {"VIRENDRA","VIKAS","SHAHIL","MANISH"};
	  String maxstring=Arrays.stream(str).max(Comparator.comparing(String::length)).get();
	  System.out.println(maxstring);
	  
	 // Replace 2 loop into java 8
	  System.out.println("-----------------29------------------------");
	  ArrayList<String> state=new ArrayList<String>() {{add("UP");add("MP");add("AP");}};
	  ArrayList<String> city=new ArrayList<String>() {{add("UP");add("BHOPAL");add("AP");}};
	  
	  state.forEach(sta->{
		  city.stream().filter(c->sta.contentEquals(c)).forEach(c->System.out.println(c));
	  });
	  
	  //WAP to delete an number from an array
	  System.out.println("-----------------30------------------------");
	  Arrays.stream(ar).boxed().filter(t->t!=15).forEach(System.out::println);
	  
	  //WAP to find number of digits in an number
	  System.out.println("-----------------31------------------------");
	  String sample = "krishna64";
	  Stream.of(sample.split("")).map(t -> t.charAt(0)).filter(t->Character.isDigit(t)).forEach(System.out::println);
	  sample.chars().mapToObj(t->(char)t).forEach(System.out::println);
	  System.out.println("----------------31-1----------------------------");
	  //sample.chars().mapToObj().filter(t->Character.isDigit(t)).forEach(System.out::println);
	  //WAP to remove special character in an string
	  System.out.println("-----------------32------------------------");
	  String sam = "@kr#ish&na64";
	  String collect = Stream.of(sam.split("")).map(t->t.replaceAll("[^A-Za-z0-9]", "")).collect(Collectors.joining());
	  System.out.println(collect);
	  
	  //convert-first-character-of-every-word-to-uppercase
	  System.out.println("-----------------33------------------------");
	  String stri = "this world has very good leader";
	  String collect2 = Stream.of(stri.split(" ")).map(word->Character.toUpperCase(word.charAt(0))+word.substring(1)).collect(Collectors.joining(" "));
	  System.out.println(collect2);
	  
	  //merge two map
	  System.out.println("-----------------34------------------------");
	  HashMap<String, Integer> map1=new HashMap() {{put("Math",45);put("Hindi",41); put("History",50);put("Physics",60);}};
	  HashMap<String, Integer> map2=new HashMap() {{put("Math",45); put("History",50);put("Arts",60);}};	
	  HashMap<String,Integer> map3=new HashMap(map1);
	  
	  map2.forEach((key,value)->map3.merge(key, value, (v1,v2)->v1+v2));
	  map3.entrySet().forEach(t->System.out.println(t.getKey()+" "+t.getValue()));
	  
	  System.out.println("-----------------35------------------------");
	  
	  Map<String, Integer> collect3 = ss.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary,(key1, key2)->key1));
	  System.out.println(collect3);
	  
      System.out.println("-----------------36------------------------");
	  
	  Map<String, String> collect4 = ss.stream().collect(Collectors.toMap(Employee::getName, Employee::getAddress,(key1, key2)->key1));
	  System.out.println(collect4);
	  System.out.println("-----------------37------------------------");
	  Map<String, String> collect5 = ss.stream().collect(Collectors.toMap(Employee::getName, Employee::getAddress,(key1, key2)->key1+key2));
	  System.out.println(collect5);
	  System.out.println("-----------------38------------------------");
	  Map<String, Integer> collect6 = ss.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary,(key1, key2)->key1+key2));
	  System.out.println(collect6);
		
	  //WAP to convert a primitive Array to a List in Java 8
	  System.out.println("-----------------39------------------------");	  
	  int[] nums = {1, 2, 3, 4, 5, 6, 7};
	 //using Arrays.stream() sequential stream with boxed
	  Arrays.stream(nums).boxed().collect(Collectors.toList());
	  //intstream.of method to boxed
	  IntStream.of(nums).boxed().collect(Collectors.toList());	  
	  
	  
	  System.out.println("-----------------39------------------------");
	  //WAP duplicate elements with its count from the String ArrayList in Java8
	  List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
	  Map<String, Long> collect7 = names.stream().filter(t->Collections.frequency(names, t)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	  System.out.println(collect7);
	  
	  System.out.println("-----------------40------------------------");
	  //WAP to print remove the special character from a given string
	  String spchar="@kr#ish&na64\"";
	  String newStr =Stream.of(spchar.split("")).map(singlechar->singlechar.charAt(0)).filter(t->Character.isLetterOrDigit(t))
	 .map(String::valueOf).collect(Collectors.joining());
	  System.out.println("-----------------40-1------------------------");
	  String newStr1 =Stream.of(spchar.split("")).map(singlechar->singlechar.charAt(0)).filter(t->Character.isLetterOrDigit(t))
				 .map(String::valueOf).collect(Collectors.reducing("", (a,b)->a+b));
	  System.out.println(newStr1);
	  
	  System.out.println("-----------------41------------------------");
	  // WAP to Convert String to integer java 8	
	  String strint="100";
	  Stream.of(strint).map(t->Integer.parseInt(t)).forEach(System.out::println);
	  
	  System.out.println("-----------------42------------------------");
	  // WAP to Convert Integer to String java 8	
	  int num=100;
	  Stream.of(num).map(t->String.valueOf(t)).forEach(System.out::println);
	  
	  System.out.println("-----------------43------------------------");
	  // WAP to Convert Character to String java 8	
	  char c='A';
	  Stream.of(c).map(t->String.valueOf(t)).forEach(System.out::println);
	  
	  System.out.println("-----------------44------------------------");
	  // WAP to Convert String to Character java 8	
	  String ca="RAM";
	  Stream.of(ca.split("")).map(t->t.charAt(0)).forEach(System.out::println);;
	  
	  System.out.println("-----------------45------------------------");
	  String[] strlen= { "ruby","java","microservice", "Springboot","python"};
	  
	  Arrays.stream(strlen).reduce((a,b)-> (a.length()>b.length()? a:b)).ifPresent(System.out::println);
	  
	  System.out.println("-----------------46------------------------");
	  List<String> dupl=new ArrayList()
			  {{add("vikas");add("vikas");add("virendra");}};
			  
	 HashMap<String, Integer> km=new HashMap<>();
	 km.put("vikas", 123);
	 km.put("Shradha", 121);
	 km.put("vishal", 121);
	 km.put("mukesh", 128);
	 
	 km.keySet().stream().sorted((a,b)->b.compareTo(a)).forEach(t->System.out.println(t));;
	 km.values().stream().sorted((a,b)->b.compareTo(a)).forEach(t->System.out.println(t));;
	 System.out.println("-----------map sorted---------------------------------------"); 
	 km.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(t->System.out.println(t));;
	 System.out.println("-----------map sorted overload---------------------------------------");
	 km.entrySet().stream().sorted(Map.Entry.comparingByKey((o1, o2) ->o1.compareTo(o2) )).forEach(t->System.out.println(t));;
	 System.out.println("-----------map sorted by values---------------------------------------");
	 km.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(t->System.out.println(t));;
	  
	 System.out.println("-----------------47------------------------");
	 int numm=153;
	 Double reduce = Stream.of(String.valueOf(numm)
			 .split(""))
			 .map(Double::parseDouble)
			 .reduce((double) 0,(a,b)->(Math.pow(a, 3)+Math.pow(b, 3)));
	 System.out.println(reduce);
	 int armstrong=String.valueOf(numm).chars()
			.map(Character::getNumericValue).map(t->(int)Math.pow(t,3)).sum();
	 System.out.println(armstrong);
	 if(armstrong==numm) {
		 System.out.println("Number is armstrong number");
	 }else {
		 System.out.println("Number is not armstrong number");
	 }	
	 
	 System.out.println("--------------48----------------");
	 
	 
	 IntStream.rangeClosed(1, 100).filter(JAVA8PROGRAM::isprime).boxed().forEach(it->System.out.println(it));
	 System.out.println("--------------49----------------");
	 String rem="Programming";
	 String removed = Stream.of(rem.split("")).map(t->t.replaceFirst("m", "")).collect(Collectors.joining());
	 System.out.println(removed);
	 System.out.println("--------------50 ----------------");
	 //working in HR dept
	 ss.stream().filter(t->t.getDepartment()=="HR").forEach(System.out::println);
	 
	 System.out.println("--------------51 ----------------");
	 //find the duplicate number
	 List<Integer> myList = Arrays.asList(1,2,3,4,4,5,6,6,7,8,9);
     Set<Integer> set = new HashSet<Integer>();
     set.addAll(myList);
     System.out.println(!set.add(4));
     myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
     
     System.out.println("--------------52----------------");
     //find max number from list
     System.out.println(myList.stream().sorted(Comparator.reverseOrder()).findFirst().get());
     System.out.println(myList.stream().mapToInt(Integer::intValue).max().getAsInt());
     int maxx =  myList.stream().max(Integer::compare).get();
      System.out.println(maxx); 
	 
      
      System.out.println("--------------53 Java 8 DateTime API ----------------");
      
      System.out.println("Date time Api : "+java.time.LocalDate.now());
      System.out.println("Date time Api : "+java.time.LocalTime.now());
      System.out.println("Date time Api : "+ java.time.LocalDateTime.now());
      
      System.out.println("--------------54----------------");
      //remove null  from list
      
      List<String> l=Arrays.asList("vikas","vishal", null, null,"Viru");
      l.stream().filter(t->t!=null).forEach(System.out::println);
      
      List ll=new ArrayList<>();
      ll.add("virendra");
      ll.add(23);
      ll.add(null);
      List<Object> obj = (List<Object>) ll.stream().filter(t->t!=null).collect(Collectors.toList());
      System.out.println(obj);
      
      System.out.println("---------55----------------");
      //Sort employee by name and salary 
      ss.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
      .forEach(System.out::println);
      
      System.out.println("--------------56-----------------------");
      //find the sum of all numbers using Java 8 stream API
      // Sorting String
      String stt="vikas";
      String t8 = stt.chars().mapToObj(j->(char)j).sorted().map(j->j.toString()).collect(Collectors.joining());
 
      System.out.println(t8);
      String t9=Stream.of(stt.split("")).sorted((a,b)->a.compareTo(b)).collect(Collectors.joining());
      System.out.println(t9);
      
      System.out.println("----------------58-sort string sent");
       String v="vikas kumar mishra";
       String vs=Stream.of(v.split(" ")).map(JAVA8PROGRAM::sort).collect(Collectors.joining(" "));
       System.out.println(vs);
       
      System.out.println("----------------59- First letter of string--------");
      String vss=Stream.of(v.split(" ")).map(JAVA8PROGRAM::GetFirstLetter).collect(Collectors.joining(" "));
      System.out.println(vss);
      
      System.out.println("-----------60--------------");
 /*     Stream.of(v.split(" "))
      .map(m->{
    	  final char c=m.charAt(0);
    	  return String.valueOf(c);
      }).collect(Collectors.joining(""));
      }*/
      System.out.println("-----------61-sort bubble sort--------------");
      int[] a= {5,2,4,7,9};
      for(i=0;i<a.length-1;i++) {
    	  for(int j=i;j<a.length;j++) {
    		   if(a[j]>a[i]) {
    			   int temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    		   }
    	  }
      }
      System.out.println(Arrays.toString(a));
      
      System.out.println("-----------62-sort java8 --------------");
      Integer integer = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
      System.out.println(integer);
       
      String f="bharat";
      System.out.println("-----------63-reversed --------------");
      
      String string = Stream.of(f.split("")).sorted((t,t1)->t.compareTo(t1)).collect(Collectors.joining());
      System.out.println(string);
      
      System.out.println("----------------64---------------------------");
      ss.forEach(p->{
    	  if(p.getSalary()<260) {
    		  throw new SalaryException("Salary is less 26000");
    	  }else {
    		  System.out.println(p.getName()+" && "+p.getSalary());
    	  }
      });
      System.out.println("----------------65---------------------------");
      String strr="virendra";
      System.out.println(strr.concat("kumar"));
      
      
      
 }

  public static String GetFirstLetter(String s) {	  
	  Character ch = Stream.of(s.split("")).map(i->i.charAt(0)).findFirst().get();
	  return String.valueOf(ch);
  }
  public static String sort(String s) {
	  return Stream.of(s.split("")).sorted((a,b)->a.compareTo(b)).collect(Collectors.joining());
  }
   public static boolean  isprime(int num) {	 
	   return num>1 && IntStream.range(2, num).noneMatch(i->num%i==0);
 }


}
