package Constructors_with_Return_Type;

class Example {
    // Invalid: This is treated as a method, not a constructor
    public int Example() {
        System.out.println("This is not a constructor, it's a method!");
        return 0;
    }

    // Correct constructor
    public Example() {
        System.out.println("This is a valid constructor.");
    }

    public static void main(String[] args) {
        Example obj = new Example();  // Calls the valid constructor
        int result = obj.Example();   // Calls the method with return type
    }
}
