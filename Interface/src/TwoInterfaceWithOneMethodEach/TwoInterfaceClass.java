package TwoInterfaceWithOneMethodEach;

public class TwoInterfaceClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method1 from Interface1 implemented.");
    }

    @Override
    public void method2() {
        System.out.println("Method2 from Interface2 implemented.");
    }

    public static void main(String[] args) {
        TwoInterfaceClass obj = new TwoInterfaceClass();
        obj.method1();
        obj.method2();
    }
}
