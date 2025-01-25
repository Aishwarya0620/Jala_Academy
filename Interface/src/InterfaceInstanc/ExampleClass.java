package InterfaceInstanc;

public class ExampleClass implements InstanceInterface {
    @Override
    public void exampleMethod() {
        System.out.println("Method called using an interface reference.");
    }

    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass(); // Interface instance
        obj.exampleMethod();
    }
}