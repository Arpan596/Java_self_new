import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number:");
        int n = sc.nextInt();
        double sum=0;
        while (n!=0) {
            int rem=n%10;
            double qube=Math.pow((rem),3);
            sum+=qube;
            n=(n-rem)/10;
        }
        System.out.println(n);
        if (153==153.0) {
            System.out.println(n+" is a amstrong number");
        }
    }
}
