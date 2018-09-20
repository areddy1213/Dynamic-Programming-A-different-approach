public class HelloWorld{
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0)
          return nums;
        int beginIndex = 0;
        int endIndex = k - 1;
        int maxIndex = -1;
        int maxVal = nums[0];
        int length = nums.length;
        int[] result = new int[length - k + 1];
        while (endIndex < length) {
            if (maxIndex < beginIndex) {
                System.out.println(beginIndex+" "+maxIndex);
                maxVal = nums[beginIndex];
                maxIndex = beginIndex;
                for (int i = beginIndex; i <= endIndex; i++) {
                    if (maxVal <= nums[i]) {
                        maxVal = nums[i];
                        maxIndex = i;
                    }
                }
            }
            result[beginIndex] = maxVal;
            beginIndex ++;
            endIndex ++;
            if (endIndex >= length) {
                break;
            }
            if (nums[endIndex] >= maxVal) {
                maxVal = nums[endIndex];
                maxIndex = endIndex;
            }
        }
        return result;
        
    }
     public static void main(String []args){
         int[] arr = new int[]{1,3,-1,4,5,3,6,7};
         int k = 3 ;
         int[] result= maxSlidingWindow(arr,k);
         
         for(int i =0 ;i<result.length;i++){
             System.out.println("Hi");
              System.out.println(result[i]);
         }
       
     }
}