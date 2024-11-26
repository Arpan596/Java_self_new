import java.util.Scanner;
public class FibonacciSeries 
{
  public static void main(String... args)
  {
    System.out.println("Enter how many numbers: ");
    Scanner scanner=new Scanner(System.in);
    int m=scanner.nextInt();
    System.out.println("FibonacciSeries of "+m+" numbers are:");
    int n=0;
    int j=1;
    for(int i=0;i<m;i++)
    {
      int k=(n+j);
      System.out.println(k);
      n=j;
      j=k;
    }
    scanner.close();
  }  
}
