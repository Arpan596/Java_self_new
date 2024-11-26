public class Sum_odd {
    public static void main(String[] args) {
        int n=10,sum=0;
        System.out.println("odd numbers: ");
        for(int i=0;i<n*2;i++)
        {
          if(i%2==0)
          continue;
          else {
            System.out.print(i+", ");
          sum=sum+i;
        }
    }
    System.out.print("\nsum:"+sum);
    }   
}
