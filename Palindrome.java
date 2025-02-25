import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int p1  = 0;
        int p2 = s.length()-1;
        boolean b = true;
        while(p1<p2){
            if(s.charAt(p2)!=s.charAt(p1))
            b=false;
            else b=true;
            p1++;
            p2--;
        }
        if (b==true) {
            System.out.println("Palindrome");
        }
        else System.out.println("not palindrome");
    }    
}
//A man, a plan, a canal: Panama