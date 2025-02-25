public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }   
    static int factorial(int n){
        return n*factorial(n-1);
    } 
}
