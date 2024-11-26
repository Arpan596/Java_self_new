import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.print("Enter the name of the year:");
        Scanner in=new Scanner(System.in);
        int year=in.nextInt();
    if(year%100!=0)
        {
        if(year%4==0)
        {
            System.out.println("This is a leap year.");
        }
        else System.out.println("This is not a leap year.");
    }
    else{
        {if(year%400==0)
        {
        System.out.println("This is a leap year.");
        }
        else 
        System.out.println("This is not a leap year.");
    }
    }
    
in.close();}
    
    
}
