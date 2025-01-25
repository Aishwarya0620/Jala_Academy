package Call_Constructor_of_the_Current_Class_Using_this;

public class CurrentClassConstructor {
    int value;

    public CurrentClassConstructor() {
        this(100); // Calls the argument constructor
        System.out.println("Default constructor called.");
    }

    public CurrentClassConstructor(int value) {
        this.value = value;
        System.out.println("Argument constructor called with value: " + value);
    }

    public static void main(String[] args) {
        CurrentClassConstructor obj = new CurrentClassConstructor();
    }
}
