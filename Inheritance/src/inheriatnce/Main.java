package inheriatnce;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create objects for each class
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        ClassC objC = new ClassC();

        // Call every method using each class's object
        System.out.println("Calling methods using ClassA object:");
        objA.methodA1();
        objA.methodA2();
        objA.overriddenMethod();

        System.out.println("\nCalling methods using ClassB object:");
        objB.methodA1(); // Inherited from ClassA
        objB.methodA2(); // Inherited from ClassA
        objB.methodB1();
        objB.methodB2();
        objB.overriddenMethod();

        System.out.println("\nCalling methods using ClassC object:");
        objC.methodA1(); // Inherited from ClassA
        objC.methodA2(); // Inherited from ClassA
        objC.methodB1(); // Inherited from ClassB
        objC.methodB2(); // Inherited from ClassB
        objC.methodC1();
        objC.methodC2();
        objC.overriddenMethod();

        // Runtime polymorphism with overridden method
        System.out.println("\nUsing superclass reference:");
        ClassA ref;

        ref = objB;
        ref.overriddenMethod(); // Calls overriddenMethod in ClassB

        ref = objC;
        ref.overriddenMethod(); // Calls overriddenMethod in ClassC

        // Runtime polymorphism with data members
        System.out.println("\nRuntime polymorphism with data members:");
        System.out.println("Using ClassA reference to ClassB object:");
        ref = objB;
        System.out.println("dataA: " + ref.dataA); // Access dataA from ClassA

        System.out.println("\nUsing ClassA reference to ClassC object:");
        ref = objC;
        System.out.println("dataA: " + ref.dataA); // Access dataA from ClassA
    }
}
