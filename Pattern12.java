import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
         int i=0;
        int j=0;
        System.out.println("Enter the line Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j<=i)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            for(j=n;j<=n;j--){
                if(j<=i)
                System.out.print(j);
                else
                System.out.print(" ");
                if(j==1)
                break;
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
    

