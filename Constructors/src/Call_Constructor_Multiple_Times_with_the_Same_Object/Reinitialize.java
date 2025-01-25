package Call_Constructor_Multiple_Times_with_the_Same_Object;

class Reinitialize {
    public Reinitialize() {
        System.out.println("Constructor called. Object initialized.");
    }

    public void reset() {
        System.out.println("Object reinitialized using a method.");
    }

    public static void main(String[] args) {
        Reinitialize obj = new Reinitialize(); // Constructor is called
        obj.reset();                           // Mimicking reinitialization
        obj.reset();                           // Calling reset again
    }
}
