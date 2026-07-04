package com.java.DataStructure.algorithms.General;

class Window implements OperatingSystem{

    @Override
    public void OS() {
        System.out.println("Windows os created");
    }
}
class Android implements OperatingSystem{

    @Override
    public void OS() {
        System.out.println("Android os created");
    }
}
class IOS implements OperatingSystem{

    @Override
    public void OS() {
        System.out.println("IOS os created");
    }
}
public class looslyCoupled {
    public static OperatingSystem getOS(OperatingSystem os){
         if(os instanceof Android){
             return new Android();
         }else if (os instanceof Window){
             return new Window();
         }else {
             return new IOS();
         }
    }
    public static void main(String[] args) {

        OperatingSystem a=new Window();
        OperatingSystem o=getOS(a);
        o.OS();
    }
}
