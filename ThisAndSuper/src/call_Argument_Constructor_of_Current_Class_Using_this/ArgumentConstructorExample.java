package call_Argument_Constructor_of_Current_Class_Using_this;


public class ArgumentConstructorExample {
    int value;

    public ArgumentConstructorExample() {
        this(50); // Calls the argument constructor
    }

    public ArgumentConstructorExample(int value) {
        this.value = value;
        System.out.println("Constructor called with value: " + value);
    }

    public static void main(String[] args) {
        ArgumentConstructorExample obj = new ArgumentConstructorExample();
    }
}
