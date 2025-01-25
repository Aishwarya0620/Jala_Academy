package operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Original value: " + num);
        System.out.println("After increment: " + increment(num));
        System.out.println("After decrement: " + decrement(num));
    }

    // Increment
    public static int increment(int x) {
        return ++x;  // or x++
    }

    // Decrement
    public static int decrement(int x) {
        return --x;  // or x--
    }
}
