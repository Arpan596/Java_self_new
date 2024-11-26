import java.util.Scanner;

public class Pattern8 { 
    public static void main(String[] args) {
        System.out.println("Enter the line Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<=n; i++){
           for(int j = 0; j<=n+n; j++){
            if(j>=i && j<=n+n-i){
                System.out.print("*");
            }
            else
            System.out.print(" ");
           }
           System.out.println(" ");
        }
    }
    
}
