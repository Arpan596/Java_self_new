import java.util.Scanner;

public class Demo_pattern {
    public static void main(String[] args) {
   System.out.println("Enter the line Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = 1;
        
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
        sc.close();
    
}
}