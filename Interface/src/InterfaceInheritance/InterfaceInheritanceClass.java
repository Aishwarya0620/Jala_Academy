package InterfaceInheritance;

public class InterfaceInheritanceClass implements ChildInterface {

    @Override
    public void parentMethod() {
        System.out.println("Parent Method");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method");
    }

    public static void main(String[] args) {
        InterfaceInheritanceClass obj = new InterfaceInheritanceClass();
        obj.parentMethod();
        obj.childMethod();
    }
}
