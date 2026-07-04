package core.java.Basic;
abstract class Parent{
    private String name;
    abstract void test();
    Parent(String name){

    }
}
 class Child extends Parent{

     Child(String name) {
         super(name);
     }

     @Override
     void test() {

     }
 }
public class AbstractClassTest {
    public static void main(String[] args) {

    }
}
