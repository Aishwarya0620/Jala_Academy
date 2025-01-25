package exception_handling;

import java.lang.reflect.Method;

public class NoSuchMethodExample {
    public static void main(String[] args) {
        try {
            Method method = String.class.getMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        }
    }
}
