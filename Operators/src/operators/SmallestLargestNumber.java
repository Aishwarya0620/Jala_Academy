package operators;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;
        int smallest = num1, largest = num1;

        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;

        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}


