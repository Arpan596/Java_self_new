import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if (n%i==0) {
                System.out.println(i);
            }
        }
    }
}
