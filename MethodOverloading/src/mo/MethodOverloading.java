package mo;

//Main Class
public class MethodOverloading {

 // 1. Same name, different number of parameters (same type)
 public void display(int a) {
     System.out.println("Method with 1 parameter: " + a);
 }

 public void display(int a, int b) {
     System.out.println("Method with 2 parameters: " + a + ", " + b);
 }

 // 2. Same name, different number of parameters (different data type)
 public void print(int a) {
     System.out.println("Integer parameter: " + a);
 }

 public void print(String s) {
     System.out.println("String parameter: " + s);
 }

 // 3. Same name, same number of parameters (same type)
 public void calculate(int a, int b) {
     System.out.println("Sum of two integers: " + (a + b));
 }

 public void calculate1(int c, int d) {
     System.out.println("Product of two integers: " + (c * d));
 }

 // 4. Same name, same number of parameters (different type)
 public void process(int a, int b) {
     System.out.println("Processing integers: " + a + " and " + b);
 }

 public void process(double x, double y) {
     System.out.println("Processing doubles: " + x + " and " + y);
 }

 // 5. Same name, same number of parameters and data type, but different return type
 // This is NOT allowed in Java due to ambiguity in method calls.
 // Uncommenting this code will result in a compile-time error.
 /*
 public int compute(int a, int b) {
     return a + b;
 }

 public String compute(int a, int b) {
     return "Result: " + (a + b);
 }
 */

 public static void main(String[] args) {
     MethodOverloading obj = new MethodOverloading();

     // 1. Call methods with same name but different number of parameters (same type)
     obj.display(10);
     obj.display(20, 30);

     // 2. Call methods with same name but different parameter types
     obj.print(100);
     obj.print("Hello");

     // 3. Call methods with same name, same number of parameters, and same type
     obj.calculate(5, 10);
     obj.calculate(3, 4);

     // 4. Call methods with same name, same number of parameters, and different types
     obj.process(7, 14);
     obj.process(3.5, 4.5);

     // 5. Demonstration of different return types with same method signature is omitted as it's not allowed.
     System.out.println("Method overloading examples executed successfully!");
 }
}
