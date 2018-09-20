import java.util.Arrays;
public class StepsSolution{
     public static int Steps(int[] arr, int n){
         int[] dp = new int[n+1];
         for(int  i =0 ; i<arr.length;i++){
             dp[arr[i]]=1;
         }
         
         for(int i=1;i<=n;i++){
             for(int j = 0;j<arr.length;j++){
                 if(i-arr[j]>0){
                     dp[i]+=dp[i-arr[j]];
                 }
             }
         }
         
         for (int i = 1 ; i <=n;i++){
             System.out.println(dp[i]);
         }
       return dp[n] ;
     }
     public static void main(String []args){
        int n = 8;
        int[] arr = new int[]{1, 2};
        
        int steps= Steps(arr,n);
        System.out.println(steps);
     }
}