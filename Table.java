import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter any number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Multiplication table of: "+n+" is:");
        for(int i=0;i<=10;i++){
            System.out.println(n+" x "+i+ " = " +n*i);
        }
    }   
}