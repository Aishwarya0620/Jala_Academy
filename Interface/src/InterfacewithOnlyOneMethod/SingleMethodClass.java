package InterfacewithOnlyOneMethod;

public class SingleMethodClass implements SingleMethodInterface {
    @Override
    public void singleMethod() {
        System.out.println("Single method implemented in the class.");
    }

    public static void main(String[] args) {
        SingleMethodClass obj = new SingleMethodClass();
        obj.singleMethod();
    }
}
