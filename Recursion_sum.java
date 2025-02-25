public class Recursion_sum {
    static int factorial(int m){
        if(m==1){
            return 1;
        }
        m*=factorial(m-1);
        return m;
    }
    public static void main(String[] args) {
        System.out.print(factorial(3)+" ");
    }
}
