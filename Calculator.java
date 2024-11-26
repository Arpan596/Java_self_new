import java.util.Scanner;
public class Calculator{
    public static void main(String... args)
    {
        System.out.println("Enter Two operands:");
        Scanner in=new Scanner(System.in);
        double m=in.nextDouble();
        double n=in.nextDouble();
        System.out.println("Now enter the operand:");
        char c=in.next().charAt(0);
        if(c=='+'){
            System.out.println("Addition of "+n+" & "+m+" is:"+(m+n));
        }
        if(c=='-'){
            System.out.println("Substruction of "+n+" & "+m+" is:"+(m-n));
        }
        if(c=='*'){
            System.out.println("Multiplication of "+n+" & "+m+" is:"+(m*n));
        }
        if(c=='/'){
            System.out.println("Division of "+n+" & "+m+" is:"+(m/n));
        }
        // else System.out.println("INVALID INPUT!!!!!");
        in.close();
    }
}