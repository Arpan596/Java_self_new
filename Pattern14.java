import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        System.out.println("Enter the line Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            int k=n*2-1;
            for(int j=0;j<=n+i;j++){
                if(j>n+1-i && j<=k)
                System.err.print("*");
                else
                System.out.print(" ");
            }
        System.out.println(" ");
        }
    }    
}
