import java.util.Scanner;

public class Add {      
    public static void main(String[] args) {
        System.out.print("Enter the first number:");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.print("Enter the second number:");
        int num2 = s.nextInt();
        System.out.println("The sum of two numbers are:" +(num1+num2));
    }
    
}
