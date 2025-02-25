import java.util.Arrays;

public class Rev_array {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5,6,7};
        // int [] ans  = new int[arr.length];
        // for(int i=arr.length-1;i>=0;i--){
        //     ans[arr.length-i-1]=arr[i];
        // }
        // System.out.println(Arrays.toString(ans));
        int start = 0;
        int end = arr.length-1;
        while(start!=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
