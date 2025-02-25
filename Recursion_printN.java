public class Recursion_printN {
    static void f(int n){
        if(n==0)
        return;
        n--;
        f(n);
        System.out.print(n+1+" ");
    }
    public static void main(String[] args) {
        f(10);
    }    
}
