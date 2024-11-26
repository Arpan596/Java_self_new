import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {     
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n=n-1;
        for(int i =0; i<=n; i++){
           for(int j = 0; j<=n+i; j++){
            if(j>=(n-i)){
                System.out.print("*");
            }
            else
            System.out.print(" ");
           }
           System.out.println(" ");
        }
    } 
}