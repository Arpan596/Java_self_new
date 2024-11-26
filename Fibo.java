import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("Enter the series limit:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int a = 0;
        int b = 1;
        while (i<=n) {
            int next = a+b;
            if (next>n) {
                return;
            }
            System.out.println(next);
            a=b;
            b=next;
            i++;
        }
    }   
}
