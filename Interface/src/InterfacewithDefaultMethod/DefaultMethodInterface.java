package InterfacewithDefaultMethod;

public interface DefaultMethodInterface {
	default void defaultMethod() {
        System.out.println("Default method called.");
    }
}

