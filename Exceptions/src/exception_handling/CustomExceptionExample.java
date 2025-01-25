package exception_handling;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is my custom exception");
        } catch (MyCustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
