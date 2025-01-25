package Class_with_Default_One_Argument_and_Two_Argument_Constructors;

class MyClass {
    // Default constructor
    public MyClass() {
        System.out.println("Default constructor called.");
    }

    // One-argument constructor
    public MyClass(int a) {
        System.out.println("One-argument constructor called. Value: " + a);
    }

    // Two-argument constructor
    public MyClass(int a, String b) {
        System.out.println("Two-argument constructor called. Values: " + a + ", " + b);
    }


    public static void main(String[] args) {
        // Instantiate the class to call all constructors
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10);
        MyClass obj3 = new MyClass(20, "Hello");
    }
}
