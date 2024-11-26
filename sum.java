import java.util.Scanner;
public class sum 
{
 public static void main(String[] args)
 {
    Scanner scanner= new Scanner(System.in);
    double sum=0;
    System.out.println("Enter the first number:\n");
    double n= scanner.nextDouble();
    System.out.println("Enter the second number:\n");
    double m= scanner.nextDouble();
    sum=m+n;
    System.out.println("Sum of this two number:\n"+sum);
    scanner.close();
 }   
}
