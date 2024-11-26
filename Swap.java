import java.util.Scanner;
public class Swap 
{
   static int temp;
   public static void main(String... args)
   {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter two values of i");
    int i=input.nextInt();
    System.out.println("Enter two values of j:");
    int j=input.nextInt();
    temp=i;
    i=j;
    j=temp;
    System.out.println("i="+i);
    System.out.println("j="+j);
    input.close();
 }   
}
