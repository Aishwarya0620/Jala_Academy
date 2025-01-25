package inheriatnce;

public class ClassC extends ClassB {
    int dataC = 30;

    // Specific methods for ClassC
    public void methodC1() {
        System.out.println("Method C1 from ClassC");
    }

    public void methodC2() {
        System.out.println("Method C2 from ClassC");
    }

    // Overridden method
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden Method in ClassC");
    }
}
