public class Second_biggest {
   static int max(int a, int b){
        if(a>b){
            return a;
        }
        else
        return b;

    }
     static int max3(int a,int b, int c){
        if(a>b){
            if(a>c)
            return a;
            else
            return c;
        }
        else
        if(b>c){
            return b;
        }
        else
        return c;
    }
    public static void main(String[] args) {
        int a=11,b=20,c=30;
        int m=max3(a,b,c);
        if (m==a) {
            System.out.println(max(b,c));
        }
        if (m==b) {
            System.out.println(max(a,c));
        }
        if (m==c) {
            System.out.println(max(a,b));
        }
        
    }
    
}
