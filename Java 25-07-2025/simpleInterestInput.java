import java.util.Scanner;
public class simpleInterestInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter Principle: ");
        int p = input.nextInt();
        System.out.print("\nEnter Rate: ");
        int r = input.nextInt();
        System.out.print("\nEnter Time: ");
        int t = input.nextInt();
        float i = (p*r*t)/100;
        System.out.println("Interest is : "+i);
        input.close();
    }
}


        
    
      



