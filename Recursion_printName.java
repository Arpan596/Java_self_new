public class Recursion_printName {
    static void f(int n){
        if(n==0)
        return;
        --n;
        f(n);
        System.out.println("Arpan");
    }
    public static void main(String[] args) {
        f(4);
    }
    
}
