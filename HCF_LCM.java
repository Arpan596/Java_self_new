import java.util.Scanner;

public class HCF_LCM {

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        
        int hcf = findGCD(num1, num2);
        int lcm = (num1 * num2) / hcf;

        System.out.println("The LCM of two numbers is: " + lcm);
    }

    // Function to find GCD of two numbers
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
