package exception_handling;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception");
        } finally {
            System.out.println("This is the finally block");
        }
    }
}
