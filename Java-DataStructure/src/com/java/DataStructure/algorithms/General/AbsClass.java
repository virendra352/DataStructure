package com.java.DataStructure.algorithms.General;
abstract class Ab{
    int nonfinalvar;
    final int finalar=20;
    static int staticvar=30;
    int nonstatic;

    public Ab(int nonfinalvar, int nonstatic) {
        this.nonfinalvar = nonfinalvar;
        this.nonstatic = nonstatic;
    }
    abstract int show();
    int run(){
        return  1;
    }
}
class bb extends Ab{

    public bb(int nonfinalvar, int nonstatic) {
        super(nonfinalvar, nonstatic);
        System.out.println(super.run());
    }

    @Override
    int show() {
        return 40;
    }
}
public class AbsClass {
    public static void main(String[] args) {
    bb b=new bb(100,200);
        System.out.println(b.finalar+" "+b.finalar+" "+b.nonstatic+" "+bb.staticvar);
        b.nonstatic=101;
        b.nonfinalvar=102;
        bb.staticvar=103;
       // b.finalar=103; //can not assign value to final variable
        System.out.println(b.finalar+" "+b.finalar+" "+b.nonstatic+" "+bb.staticvar);

    }
}
