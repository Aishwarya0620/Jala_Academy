package inheriatnce;

public class ClassB extends ClassA {
    int dataB = 20;

    // Specific methods for ClassB
    public void methodB1() {
        System.out.println("Method B1 from ClassB");
    }

    public void methodB2() {
        System.out.println("Method B2 from ClassB");
    }

    // Overridden method
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden Method in ClassB");
    }
}
