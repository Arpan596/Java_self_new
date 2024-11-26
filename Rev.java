public class Rev {
    public static void main(String[] args) {
        int num=1200;
        int reverse=0,remainder=0;
        while(num>0)
        {
          remainder=num%10;
          reverse=(reverse*10)+remainder;
          num=(num)/10;
          //System.out.print(remainder);
        }
        System.out.print(reverse);
    }
    
}
