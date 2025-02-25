import java.util.ArrayList;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int n=1;
        int max=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (n>0) {
            int i=0;
         n=sc.nextInt();
         list.add(n);
         if (list.size()>=2) {
             max=list.get(i);
             if (list.get(i)<list.get(i+1)) {
                 max=list.get(i+1);
                }
            }
            i++;
        }
        System.out.println(max);
    }    
}