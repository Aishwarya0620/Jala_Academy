package exception_handling;

public class Arithmetic_Exception_using_try_catch_block {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e.getMessage());
        }
    }
}
