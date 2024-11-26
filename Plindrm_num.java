import java.util.Scanner;

public class Plindrm_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len=0;
        System.out.print("Enter the length of the number:");
        len = in.nextInt();
        System.out.print("Enter a numer:");
        int n = in.nextInt();
        int num=0;
        for(int i=0; i<len; i++){
            int rem = n%10;
            num = num*10 + rem;
            n=(n-rem)/10;
        }
        System.out.println(num);
        if(n==num)
        System.out.println(num+" and "+n+" are same. So it is a palindrome number");
        else System.out.println("This is not a palindorme number");

    }
}
