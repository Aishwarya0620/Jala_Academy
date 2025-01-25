package TwoInterfaceswiththeSameMethodSignature;

public class SameMethodClass implements Interface1, Interface2 {
    @Override
    public void sameMethod() {
        System.out.println("Same method implemented from both interfaces.");
    }

    public static void main(String[] args) {
        SameMethodClass obj = new SameMethodClass();
        obj.sameMethod();
    }
}