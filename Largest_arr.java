public class Largest_arr {
    static int largest(int[] arr){
        int max=arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr={5,3,6,1,0,9,7,7};
        int x = largest(arr);
        System.out.println(x);
    }    
}
