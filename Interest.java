import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        int principle=0,time=0,rate=0;
        System.out.println("Enter Principle: ");
        Scanner sc = new Scanner(System.in);
        principle = sc.nextInt();
        System.out.println("Enter time: ");
        time=sc.nextInt();
        System.out.println("Enter rate: ");
        rate=sc.nextInt();
        int interest=(principle*time*rate)/100;
        System.out.println("Simple Interest of this principle is "+(interest+principle));
        
    }
}
