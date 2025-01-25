package Calling_Superclass_Constructors_from_a_Child_Class;

class Parent {
    // Default constructor
    public Parent() {
        System.out.println("Parent default constructor called.");
    }

    // Argument constructor
    public Parent(int x) {
        System.out.println("Parent one-argument constructor called. Value: " + x);
    }
}

class Child extends Parent {
    // Child class default constructor
    public Child() {
        super(); // Calling Parent's default constructor
        System.out.println("Child default constructor called.");
    }

    // Child class argument constructor
    public Child(int y) {
        super(y); // Calling Parent's one-argument constructor
        System.out.println("Child one-argument constructor called. Value: " + y);
    }

    public static void main(String[] args) {
        Child child1 = new Child();       // Calls Parent's default and Child's default constructors
        Child child2 = new Child(50);    // Calls Parent's argument and Child's argument constructors
    }
}
