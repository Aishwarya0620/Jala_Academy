package PrintFields_Instance_Members_of_the_Parent_Class_Using_super;

public class ChildClass extends ParentClass {
    int childField = 10;
    
    public void printParentField() {
        System.out.println("Field from parent class using super: " + super.parentField);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.printParentField();
    }
}