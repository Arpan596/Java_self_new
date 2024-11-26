import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        System.out.println("Enter the line Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k=-1;
        n=n-1;
         
        for( i =0; i<=n+n; i++){
            if(i<=n)
            k++;
            else k--;
           for( j = 0; j<=n+n; j++){
            if(j>=(n-k) && j<=n+k){
                System.out.print("*");
            }
            else
            System.out.print(" ");
        }
           System.out.println(" ");
        }
    }    
}
