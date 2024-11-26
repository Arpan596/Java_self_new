import java.util.Scanner;
public class Prime_input 
{
 public static void main(String... args)
 {
    boolean b=true;
    System.out.print("Enter any number:");
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    for(int i=2;i<n;i++)
    {
        if(n%i==0){
        b=false;
        break;}
    }
    if(!b)
    System.out.println(n+" is not a prime number.");
    else
    System.out.println(n +" is a prime number.");
    in.close();


 }   
}
