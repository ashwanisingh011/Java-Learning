import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter your age: ");
        int age = input.nextInt();

       
        input.nextLine(); 
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        input.close();
    }
}
