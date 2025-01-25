package exception_handling;

public class ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}
