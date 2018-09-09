import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the unboundedKnapsack function below.
 static int unboundedKnapsack(int k, int[] arr) {
        int sol=0;
      int[] maxsum = new int[k+1];
        for(int i=0;i<arr.length ; i++){
            
            for (int j = 1 ; j<=k;j++){
                if(j%arr[i] == 0 ){
                    maxsum[j] = 1;
                }
                if(maxsum[j]==1 && (j+arr[i] <=k)){
                    maxsum[j+arr[i]]=1;
                }
            }
        }
        for (int m = k; m >=1;m--)
        {
            if(maxsum[m]==1){
                sol= m;
                break;
            }
        }
        return sol;
    }


    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      for(int f= 0; f<t;f++){
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = unboundedKnapsack(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
      }
        bufferedWriter.close();
      
        scanner.close();
    }
}