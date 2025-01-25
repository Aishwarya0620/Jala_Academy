package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }

    // Addition
    public static int add(int x, int y) {
        return x + y;
    }

    // Subtraction
    public static int subtract(int x, int y) {
        return x - y;
    }

    // Multiplication
    public static int multiply(int x, int y) {
        return x * y;
    }

    // Division
    public static double divide(int x, int y) {
        if (y != 0) {
            return (double) x / y;
        } else {
            return Double.NaN;  // return NaN for division by zero
        }
    }
}
