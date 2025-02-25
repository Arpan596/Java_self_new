import java.util.Arrays;

public class Sort_rotation_K {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        Arrays.sort(nums);
        public void rotate(int[] nums, int k) {
            k=k%nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
        public void reverse(int[] arr, int start, int end){
                while(start<end){
                     int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
        }
    }
}
