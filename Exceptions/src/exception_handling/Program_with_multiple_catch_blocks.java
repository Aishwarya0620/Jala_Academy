package exception_handling;

public class Program_with_multiple_catch_blocks {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[4] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (Exception e) {
            System.out.println("General Exception caught");
        }
    }
}
