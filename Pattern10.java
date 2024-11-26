import java.util.Scanner;

public class Pattern10 {
 public static void main(String[] args) {
    int i,j=1, k=-1;
    System.out.println("Enter the line Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    n=n+1;
    for(i=1;i<=n;i++){
        if(i<=j)
            k++;
        else k--;
        for(j=1;j<=n/2;j++){
            if(j<=k)
            System.out.print("*");
            else 
            System.out.print(" ");
        }
    System.out.println(" ");
    }
 }   
}
