
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
class Student{
	String name;
	int salary;

	public Student(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class JAVA8PROGRAM {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	List<Employee>ss=new ArrayList<>();
	  
	  ss.add(new Employee(30000,"VIKAS","VAISHALI","HR"));
	  ss.add(new Employee(50000,"VISHAL","NOIDA","DEVELOPER"));
	  ss.add(new Employee(28000,"AJAY","DELHI","TESTER"));
	  ss.add(new Employee(80000,"RAM","JAIPUR","DEVELOPER"));
	  ss.add(new Employee(50000,"RAHUL","DELHI","HR"));
	  ss.add(new Employee(25000,"AJAY","JAIPUR","TESTER"));
	  ss.add(new Employee(28000,"RAHUL","PUNE","FINANCE"));
	  Map<String, List<Employee>> groupByDepartment = ss.stream().collect(Collectors.groupingBy(Employee::getDepartment));


	  //WAP to find highest salary of an employee from each department
	  System.out.println("-----------------1------------------------");
	  Map<String, Optional<Employee>> mapobj = ss.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	  mapobj.entrySet().forEach(s->System.out.println(s.getKey()+" and highest salary is : "+s.getValue().get().getSalary()));


	  //WAP to find max/min salary of an Employee
	  System.out.println("-----------------2------------------------");
	  Integer i = ss.stream().map(s->s.getSalary()).max((a,b)->a-b).get();
	  System.out.println(i);
	  System.out.println("-----------------2.1------------------------");
	  System.out.println(ss.stream().max(Comparator.comparing(Employee::getSalary)).get());
	  
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
	  
	  //WAP to find second-highest number in array
	  System.out.println("-----------------15------------------------");
	  int[] ar= {12,15,29,46,26,34,68};
	  Arrays.stream(ar).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
	  //WAP to find the sum of all element of array
	  System.out.println("-----------------16------------------------");
	  Integer sumReduce = Arrays.stream(ar).boxed().reduce(0,(a,b)->a+b);
	  System.out.println(sumReduce);
	  
	  System.out.println("-----------------17------------------------");
	  IntStream m= IntStream.of(12,15,29,46,26,34,68);
	  IntStream.range(1, 10); //second parameter is exclusive
	  IntStream.rangeClosed(1, 10);  //Both parameter are inclusive
	  System.out.println("-----------------18------------------------");
	  Arrays.stream(ar).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
	  int sum=Arrays.stream(ar).sum();
	  System.out.println("-----------------18.1------------------------");
	  Integer collectSum = Arrays.stream(ar).boxed().mapToInt(a -> a).sum();
	  System.out.println("Total Array sum: "+collectSum);
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
	  String sorted=Stream.of(stt.split("")).sorted((x,y)->y.compareTo(x)).collect(Collectors.joining());
	  System.out.println(sorted);
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
	 String reverse = IntStream.rangeClosed(0, st.length() - 1)
			.mapToObj(k -> st.charAt(st.length() - 1 - k))
			.map(String::valueOf)
			.collect(Collectors.joining());

	System.out.println(reverse);
	List<String> re = Stream.of(st.split("")).collect(Collectors.toList());
	Collections.reverse(re);
	String collect1 = re.stream().collect(Collectors.joining());
	System.out.println(collect1);

	String reverseOrder=Stream.of(strr).map(k->new StringBuffer(k).reverse()).collect(Collectors.joining());
	System.out.println(reverseOrder);

	System.out.println("----------------66-GroupingByDepartment---------------------");
      //WAP to Group the employee based on department
	Map<String, List<Employee>> groupByDepart = ss.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	System.out.println(groupByDepart);

	System.out.println("----------------67---------------------------");
	Map<String, Set<String>> groupByDeptandName = ss.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toSet())));
	System.out.println(groupByDeptandName);

	System.out.println("----------------68---------------------------");
	String palindrome= "A man, a plan, a canal, Panama!";
	Optional<StringBuffer> first = Stream.of(palindrome.replaceAll("[^a-zA-Z0-9]", "")).map(j -> new StringBuffer(j).reverse()).findFirst();
	System.out.println(first.get());

	System.out.println("----------------69---------------------------");
	//convert stream to map with sorted key
	Stream<String> stream= Stream.of("Viru", "Vikas","Pravin","Vikas");
	TreeMap<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length, (x, b) -> x, TreeMap::new));
	System.out.println(map);

	System.out.println("----------------70---------------------------");

	//Find Highest salary employee from each department
	Map<String, Optional<Employee>> em=ss.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	System.out.println(em);

	System.out.println("----------------71---------------------------");
	//Find Highest salary employee from each department
	Map<String, Optional<Employee>> emm=ss.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy((x,y)->x.getSalary()-y.getSalary())));
	System.out.println(emm);

	System.out.println("----------------72---------------------------");

	List<Integer> numbers = Arrays.asList(6, 2, 1, 4, 9);
	Integer maxNumber=numbers.stream().collect(Collectors.maxBy(Comparator.comparingInt(z->z))).get();
	Integer minNumber=numbers.stream().min(Comparator.naturalOrder()).get();
	System.out.println(maxNumber);
	System.out.println(minNumber);

	System.out.println("----------------73---------------------------");

	List<Employee> sort=ss.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
	System.out.println(sort);

	System.out.println("----------------74---------------------------");

	Map<String, Set<String>> namesByCity = ss.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.mapping(Employee::getAddress,Collectors.toSet())));
	System.out.println(namesByCity);

	System.out.println("----------------75---------------------------");

	Map<Boolean, Integer> partitioningBY = ss.stream().collect(Collectors.partitioningBy(x -> x.getSalary() >= 30000,Collectors.reducing(0,Employee::getSalary,Integer::sum)));
	System.out.println(partitioningBY);

	System.out.println("----------------76---------------------------");

	String s1 = "hello";
	String s2 = new String("hello");

	System.out.println(s1.hashCode()); // Same value
	System.out.println(s2.hashCode()); // Same value

	System.out.println("----------------77---------------------------");

	List<Integer> list= Arrays.asList(1,2,3,3,4,5,6);
    list.stream().max((x, y) -> x - y).ifPresent(System.out::println);

	System.out.println("----------------78---------------------------");

	List<String> list1= Arrays.asList("avi","ravi","charlie","vira");
	 list1.stream().map(String::toUpperCase).forEach(System.out::println);
	//use of mapToInt() method . it is used for transforming stream<T> to intStream
	//int sum = employees.stream().map(Employee::getAge).mapToInt(s -> s).sum();
	//int sum = employees.stream().mapToInt(Employee::getAge).sum();

	System.out.println("----------------79---------------------------");

	Map<Integer, List<String>> collectByLength = list1.stream().collect(Collectors.groupingBy(String::length));
	System.out.println(collectByLength);

	System.out.println("----------------80---------------------------");

	Integer reduceSum = list.stream().reduce(0, Integer::sum);
	Integer reduceSum1 = list.stream().reduce(0, (x,y)->x+y);
	System.out.println(reduceSum + " : "+reduceSum1);

	System.out.println("----------------81---------------------------");

	List<String> word=Arrays.asList("apple","banana","apple");
	Map<String,Long> words=word.stream().collect(Collectors.groupingBy(w->w,Collectors.counting()));
	System.out.println(words);

	System.out.println("----------------82---------------------------");

	String sentence=word.stream().collect(Collectors.joining(","));
	System.out.println(sentence);

	System.out.println("----------------83---------------------------");

	List<Student> student = Arrays.asList(
			new Student("John", 3000),
			new Student("Jane", 2500),
			new Student("Mike", 3500)
	);
	List<Student> sortedBySalary = student.stream().sorted((x, y) -> x.getSalary() - y.getSalary()).collect(Collectors.toList());
	System.out.println(sortedBySalary);
	student.stream().sorted(Comparator.comparingInt(Student::getSalary)).forEach(System.out::println);

	System.out.println("----------------84---------------------------");

	// Non-repeated character in string
	String input="swiss";
	Optional<Map.Entry<String, Long>> firstNonRepeated = Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
			.entrySet().stream().filter(x -> x.getValue() == 1l).findFirst();
	System.out.println(firstNonRepeated.get().getKey());

	System.out.println("----------------85---------------------------");

	List<String> listArray = Arrays.asList("man-2", "female-2", "man-3", "female-4", "man-5");

	Map<String, Integer> result = listArray.stream()
			.map(x -> x.split("-")) // split into [key, value]
			.collect(Collectors.toMap(
					arr -> arr[0],                         // key = "man" / "female"
					arr -> Integer.parseInt(arr[1]),       // value = number
					Integer::sum                           // merge function (sum if key repeats)
			));

	System.out.println(result);

	System.out.println("----------------86---------------------------");

	//9  Remove duplicate
	list.stream().distinct().forEach(System.out::println);

	System.out.println("----------------87---------------------------");

	//10

	List<Student> student1 = Arrays.asList(
			new Student("John", 3000),
			new Student("Jane", 2500),
			new Student("Mike", 3500),
			new Student("John", 3000)
	);
	student1.stream().distinct().forEach(System.out::println);

	System.out.println("----------------88---------------------------");

	//11 ,get String start with "A"

	list1.stream().filter(x->x.startsWith("a")).forEach(System.out::println);

	System.out.println("----------------89---------------------------");

	//12- sort list of string alphabetically and in reverse order
	List<String> namesList=Arrays.asList("Charlie","Alice","Bob");
	namesList.stream().sorted().forEach(System.out::println);
	namesList.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);

	System.out.println("----------------90---------------------------");

	//13
	List<List<Integer>> nestedList=  Arrays.asList(Arrays.asList(1,2,3),
			Arrays.asList(4,5));

	List<Integer> collectRes = nestedList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
	System.out.println(collectRes);

	System.out.println("----------------91---------------------------");

	//14  partitioningBY
	Map<Boolean, List<Integer>> collect4Res = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
	System.out.println(collect4Res);

	System.out.println("----------------92---------------------------");

	//15
	String stringSentence="Java is fun and java is powerful";
	Map<String, Long> collect5Res = Arrays.stream(stringSentence.split(" "))
			.collect(Collectors.groupingBy(w -> w, Collectors.counting()));
	System.out.println(collect5Res);

	System.out.println("----------------93---------------------------");

	//16
	Integer i1re = names.stream().map(String::length).max((x, y) -> x - y).get();
	String i2re = names.stream().max(Comparator.comparingInt(String::length)).get();
	System.out.println(i1re+ " : "+i2re);

	System.out.println("----------------94---------------------------");

	//17
	List<Integer> numbersRe=Arrays.asList(10,20,5,15);
	Integer i3 = numbersRe.stream().min(Integer::compare).get();
	Integer i33 = numbersRe.stream().min(Comparator.comparingInt(x->x)).get();
	System.out.println(i3+" "+i33);

	System.out.println("----------------95---------------------------");

	//18
	List<Integer> number=Arrays.asList(1,2,2,3,1,5);
	Set<Integer> collect6Re = number.stream().filter(n -> Collections.frequency(number, n) >1).collect(Collectors.toSet());
	System.out.println(collect6Re);

	System.out.println("----------------96---------------------------");

	//20
	Map<Boolean, List<Integer>> collect7Re = number.stream().collect(Collectors.partitioningBy(n -> isPrime(n)));
	System.out.println(collect7Re);
	collect7Re.entrySet().stream().map(n->n.getKey()?Map.entry("prime",n.getValue()):Map.entry("Not-prime",n.getValue())).forEach(System.out::println);

	System.out.println("----------------97---------------------------");

	//21 Collectors.teeing() -> to compute two operation on a stream

	Map<String, Double> collect8 = number.stream().collect(Collectors.teeing(
			Collectors.summingDouble(n -> n),
			Collectors.averagingDouble(n -> n),
			(sums, avgs) -> Map.of("sum", sums, "avg", avgs)
	));
	System.out.println(collect8);

	System.out.println("----------------98---------------------------");

	//22 palindrome
	List<String> data=Arrays.asList("madam","racecar","java","level");
	data.stream().filter(wor->wor.equals(new String(new StringBuffer(wor).reverse()))).forEach(System.out::println);


	System.out.println("----------------99---------------------------");
	//
	Map<String,String> mapRe=new HashMap<>();
	mapRe.put("abc","abc");
	mapRe.put("bcd","bcd");
	mapRe.put("cde","bcd");
	mapRe.put("A","bcd");

	LinkedHashMap<String, String> collect9 = mapRe.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).collect(Collectors.toMap(
			Map.Entry::getKey,
			Map.Entry::getValue,
			(oldValue, newValue) -> oldValue,
			LinkedHashMap::new
	));
	System.out.println(collect9);

	System.out.println("----------------100---------------------------");

	List<String> wordss = Arrays.asList("abc", "aba", "abcd", "abca");

	String results = wordss.stream()
			.filter(JAVA8PROGRAM::hasAllUniqueChars) // keep only distinct-char strings
			.max(Comparator.comparingInt(String::length))     // pick longest
			.orElse(null); // return null if none found

	System.out.println("Longest distinct string: " + results);


	System.out.println("----------------101---------------------------");
	List<String> name = Arrays.asList("vikas", "mahaesh", "suresh", "patel");

	List<String> collect10 = name
			.stream()
			.sorted(Comparator.comparing(letter -> letter.charAt(1)))
			.toList();
	System.out.println(collect10);

}

	// helper method to check unique chars
	private static boolean hasAllUniqueChars(String s) {
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (!set.add(c)) return false; // duplicate found
		}
		return true;
	}

	public static boolean  isPrime(int num) {
		return num>1 && IntStream.range(2, num).noneMatch(i->num%i==0);
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
