public class HelloWorld{

     public static void main(String []args){
        int n = 100;
        int[] dp = new int[n+1];
       // dp[1]=1;
        dp[2]=1;
        dp[3]=1; 
        for (int i=4;i<=n;i++){
            int div2,div3,min1;
           div2 = (i%2==0) ? dp[i/2] : Integer.MAX_VALUE;
           div3 = (i%3==0) ? dp[i/3] : Integer.MAX_VALUE;
           min1 = dp[i-1]; 
            
           dp[i]= 1+ Math.min(div2, Math.min(div3,min1)); 
        }
        
        System.out.println(dp[n]);
     }
}