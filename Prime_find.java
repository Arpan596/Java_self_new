import java.util.Scanner;

public class Prime_find 
{
 public static void main(String[] args) {
    System.out.print("Enter to where the prime number will be printed:");
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    boolean isPrime=true;
    for(int i=2;i<n;i++){
        if(isPrime)
        System.out.println(i);
        }
        input.close();
    }
    public static boolean isPrime(int m)
    {
        int n=0;
        if(n<=1)
        return false;
        else{
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                return false;
            }
            return true;
        }
        
    }

 }   

