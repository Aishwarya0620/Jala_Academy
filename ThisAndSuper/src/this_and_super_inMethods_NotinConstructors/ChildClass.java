package this_and_super_inMethods_NotinConstructors;

public class ChildClass extends ParentClass {
    public void callParentMethod() {
        super.parentMethod(); // Calls parent class method
    }

    public void callCurrentMethod() {
        this.display(); // Calls current class method
    }

    public void display() {
        System.out.println("Current class method called.");
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.callParentMethod();
        obj.callCurrentMethod();
    }
}