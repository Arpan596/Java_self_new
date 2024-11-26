import java.util.Scanner;
public class Sum_digits 
{
  public static void main(String... args)
  {
    System.out.print("Enter number of digits your number have:");
    Scanner in=new Scanner(System.in);
    int m=in.nextInt();
    System.out.print("Enter the number:");
    int n=in.nextInt();

    // int count=0;
    // while(n%10!=0){
    //  count++;
    // }
    int rem=0,sum=0;
    for(int i=0;i<=m;i++)
    {
      rem=n%10;
      sum=sum+rem;
      n=n-rem;
      n=n/10;
      
    }
    System.out.println(sum);
    in.close();
  }  
}
