package PublicInterfacewithFieldsandMethods;

public class PublicInterfaceClass implements PublicInterface {
    @Override
    public void publicMethod() {
        System.out.println("Public method called.");
    }

    public static void main(String[] args) {
        PublicInterfaceClass obj = new PublicInterfaceClass();
        System.out.println("Field value: " + CONSTANT);
        obj.publicMethod();
    }
}