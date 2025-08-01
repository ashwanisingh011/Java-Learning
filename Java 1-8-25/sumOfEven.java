import java.util.Scanner;

public class sumOfEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number of values to check: ");
        int num = input.nextInt();
        input.close();

        int i = 1;
        int n = 1;
        int evenSum = 0;
        int oddSum = 0;

        while (i <= num) {
            n += 1;
            if (n % 2 == 0) {
                System.out.println("Num is Even: " + n);
                evenSum += n;
            } else {
                System.out.println("Num is Odd: " + n);
                oddSum += n;
            }
            i++;
        }

        System.out.println("\nSum of Even numbers: " + evenSum);
        System.out.println("Sum of Odd numbers: " + oddSum);
    }
}
