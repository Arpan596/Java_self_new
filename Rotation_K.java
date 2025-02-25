import java.util.Arrays;

public class Rotation_K {
    public static void reverse(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        int k=3;
        reverse(a, 0, a.length-1);
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        System.out.println(Arrays.toString(a));
    }    
}
