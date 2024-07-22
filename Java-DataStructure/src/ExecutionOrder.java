
public class ExecutionOrder {
	static int staticVar = 1;
    int instanceVar = 2;
    
    static {
        System.out.println("Static block is executed first.");
        staticVar = 10;
    }
    
    {
        System.out.println("Instance block is executed before constructor.");
        instanceVar = 20;
    }
    
    public ExecutionOrder() {
        System.out.println("Constructor is executed after instance block." +instanceVar);
    }
    
    public static void staticMethod() {
        System.out.println("Static method is executed without creating an instance.");
        System.out.println("Static variable value: " + staticVar);
    }
    
    public static void main(String[] args) {
        ExecutionOrder example = new ExecutionOrder();
        staticMethod();
    }
}
