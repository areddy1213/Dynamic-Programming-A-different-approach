import java.util.Arrays;

public class Solution {



    public static int noofways(int[] arr, int N){
        int[] dp = new int[N+1];
        Arrays.fill(dp,0);
        for(int k =0;k<arr.length;k++){
            dp[arr[k]]=1;
        }

        for (int i=1;i<N+1;i++){
            for(int j = 0 ;j<arr.length;j++){
                if(i-arr[j]>0){
                    dp[i]+=dp[i-arr[j]];
                }
            }

        }
        return dp[N];
    }

    public static void main(String[] args){
        int n =4;
        int[] num = new int[]{1, 3};

        int num_of_ways = noofways(num,n);
        System.out.println(num_of_ways);

    }
}