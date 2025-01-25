package PrintFields_InstanceMembersoftheCurrentClassUsingthis;

public class CurrentClassExample {
    int instanceField = 10;

    public void printField() {
        System.out.println("Field using this: " + this.instanceField);
    }

    public static void main(String[] args) {
        CurrentClassExample obj = new CurrentClassExample();
        obj.printField();
    }
}
