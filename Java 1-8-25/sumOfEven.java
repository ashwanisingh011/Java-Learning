import java.util.Scanner;
public class sumOfEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Odd numbers: ");
        int num = input.nextInt();
        input.close();
        int i = 1;
        int n = 1;
        int sum = 0;
        while(i<=num){
            n+=1;
            if(n%2==0){
                System.out.println("Num is Even "+n);
                sum+= n;
                i++;
            }
               
            else{
                System.out.println("Num is odd " +n);
                i++;
                sum+= n;
            }
        }
            
            System.out.println("Sum is even "+sum);
            System.out.println("Sum is of odd"+sum);
        }
        
    }
        
              
