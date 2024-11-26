import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the year:" );
        int year = in.nextInt();
        if(year%4==0){
            System.out.println(year+" is a leapyear");
        }
        else System.out.println(year+" is not a leapyear");
        
    }
    
}
