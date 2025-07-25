import java.util.Scanner;
public class Area {
     public static void main(String s[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side : ");
        int sqr = input.nextInt();
        int areaSqr = sqr*sqr;
        System.out.println("\nArea of Square is " +areaSqr);
        System.out.print("Enter length: ");
        int len = input.nextInt();
        System.out.print("Enter Width: ");
        int width = input.nextInt();
        int areaRect = len * width;
        System.out.println("\n Area of Reactange is : "+ areaRect);

        input.close();
    }
}
