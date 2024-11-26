import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int k=1;
        System.out.println("Enter the line Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=0;i<n;i++){
            if(i%2==0)
            k=1;
            else
            k=0;
            for(j=0;j<n;j++){
                if(j<=i)
                System.out.print(k+" ");
                else
                System.out.print(" ");
                if(k==1)k=0;
                else k=1;
            }
            System.out.println("");
        }
    }
    
}
