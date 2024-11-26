import java.util.Scanner;
public class factorial 
{
  public static void main(String[] args)
  {
    System.out.println("Enter factorial of which number:");
    Scanner scanner= new Scanner(System.in);
    int n=scanner.nextInt();
    int fact=1;
    for(int i=0;i<n;i++){
        fact=(fact*i)+fact;
    }
    System.out.println("factorial of " +n + " is " +fact);
    scanner.close();

  }    
}
