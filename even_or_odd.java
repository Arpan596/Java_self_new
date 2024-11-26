import java.util.Scanner;
public class even_or_odd 
{
  public static void main( String[] args)
  {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter any positive number: ");
    int n = scanner.nextInt();
    if(n%2==0){
        System.out.println( n +" is a even number.");
    }
    else
    System.out.println(n+" is a odd number");
    scanner.close();
  }  
}
