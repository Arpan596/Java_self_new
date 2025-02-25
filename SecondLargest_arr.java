public class SecondLargest_arr {
    static int Slargest(int[] arr){
        int max=arr[0];
        int smax=Integer.MIN_VALUE;
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            for(int i = 0; i<arr.length;i++){
                if (arr[i]==max) {
                    continue;
                }
                if(arr[i]>smax){
                    smax=arr[i];
                }
            }
            if (smax==Integer.MIN_VALUE)
                return -1;
        return smax;
    }       
    public static void main(String[] args) {
        int []arr={10,5,10};
        int x = Slargest(arr);
        System.out.println(x);
    }        
}

