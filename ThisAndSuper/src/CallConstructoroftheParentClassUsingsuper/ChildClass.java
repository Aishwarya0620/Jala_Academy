package CallConstructoroftheParentClassUsingsuper;

public class ChildClass extends ParentClass {
    public ChildClass() {
        super(); // Calls the parent class constructor
        System.out.println("Child class constructor called.");
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
    }
}