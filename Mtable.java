import java.util.Scanner;

public class Mtable 
{
 public static void main(String... args)
 {
    System.out.print("Enter the number for table:");
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1;i<=10;i++)
    {
        System.out.println(n+"x"+i +"="+ n*i);
    }
    in.close();
 }   
}
