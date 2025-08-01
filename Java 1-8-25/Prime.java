import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no : ");
        int n = input.nextInt();
        input.close();
        for(int i = 1; i<=n; i++){
            int c = 0;
            for(int j = 1; j<=i; j++){
                if(i%j==0) c++;`
            }
            if(c==2){
                System.out.println(i);
            }
        }
    }
}
