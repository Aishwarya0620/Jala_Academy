package Access_Modifiers_Applied_to_Constructors;

class Demo {
    // Public constructor
    public Demo() {
        System.out.println("Public constructor called.");
    }

    // Protected constructor
    protected Demo(String name) {
        System.out.println("Protected constructor called. Name: " + name);
    }

    // Default (package-private) constructor
    Demo(int id) {
        System.out.println("Default constructor called. ID: " + id);
    }

    // Private constructor
    private Demo(double value) {
        System.out.println("Private constructor called. Value: " + value);
    }

    // Public static method to access private constructor
    public static Demo createInstance(double value) {
        return new Demo(value);
    }


    public static void main(String[] args) {
        Demo obj1 = new Demo();               // Public
        Demo obj2 = new Demo("John");         // Protected
        Demo obj3 = new Demo(123);            // Default
        Demo obj4 = Demo.createInstance(99.9); // Access private constructor via static method
    }
}
