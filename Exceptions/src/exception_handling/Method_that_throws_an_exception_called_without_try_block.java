package exception_handling;

public class Method_that_throws_an_exception_called_without_try_block {
    public static void throwException() throws ArithmeticException {
        throw new ArithmeticException("Exception thrown from method");
    }

    public static void main(String[] args) {
        throwException(); // No try block
    }
}
