import java.util.Scanner;
static int qualityCount(int arr[][]){
    int count =0;
    int element=0;
    if(arr[1][1])
        continue;
    if (arr[i-1][j-1])!=0 
        count++;
    if (arr[i][j-1])!=0 
        count++;
    if (arr[i+1][j-1])!=0 
        count++;
    if (arr[i-1][j])!=0 
        count++;
    if (arr[i+1][j+1])!=0 
        count++;
    if (arr[i][j+1])!=0 
        count++;
    if (arr[i+1][j+1])!=0 
        count++;
    if (arr[i+1][j])!=0 
        count++;
    if (arr[i-1][j+1])!=0 
        count++;
     if(count>element;
    
}
public class Bride {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] arr = new int[N][M];
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=M; j++){
                 arr = [i][j]=sc.nextInt();
            }
        }
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=M; j++){
                 qualityCount(arr[i][j]);
                
            }
        }
        
    }
}
