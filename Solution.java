class Solution{
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(2
        34));
    }
     static int subtractProductAndSum(int n) {
        int sum =0; 
        int product= 1;
        while(n>0){
            int remainder = n%10;
            sum+=remainder;
            product*=remainder;
            n/=10;
        }
        return product-sum;
        
    }
}