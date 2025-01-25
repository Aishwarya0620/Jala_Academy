package exception_handling;

import java.lang.reflect.Field;

public class NoSuchFieldExample {
    public static void main(String[] args) {
        try {
            Field field = String.class.getField("nonExistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
        }
    }
}
