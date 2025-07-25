// Arithmetic Operators
import java.util.Scanner;
public class arithmetic {
    public static void main(String s[]){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter first number: ");
        int a = input.nextInt();
        System.out.print("\n Enter Second number: ");
        int b = input.nextInt();
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        float div = a / b;
        float mod = a % b;
        System.out.println("Addition "+ add);
        System.out.println("Subtraction "+ sub);
        System.out.println("Multiplication "+ mul);
        System.out.println("Division "+ div);
        System.out.println("Modulas"+ mod);
        input.close();
    }
}
