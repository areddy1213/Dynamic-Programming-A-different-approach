import java.util.Arrays;
public class LongestIncDecSubSeq{
    public static int longestbitonic(int[] ar, int n){
        int[] dp = new int[n];
          Arrays.fill(dp,1);
         
         int[] dpd = new int[n];
          Arrays.fill(dpd,1);
           
        for (int i = 1 ;i<n;i++){
           for(int j = 0;j<i;j++){
               if(ar[i]>ar[j] && dp[i]<(dp[j]+1)){
                   dp[i]=dp[j]+1;
               }
           }    
              
        }
       
        
        
         for (int m = n-2;m>=0;m--){
           for(int v = n-1; v> m ;v--){
              
               if(ar[m]>ar[v] && dpd[m]<(dpd[v]+1)){
                   dpd[m]=dpd[v]+1;
               }
           }    
              
        }
       
        int max= Integer.MIN_VALUE;
        for(int k=0 ;k<n;k++){
            int j= dp[k]+dpd[k];
            if(j>max){
                max=j;
            }
        }
        
        return max;
    }
     
     public static void main(String []args){
        int n = 8;
        int[] arr = new int[]{1, 11, 2, 10, 4, 5, 2, 1};
        
        int max= longestbitonic(arr,n);
        System.out.println(max-1);
     }
}