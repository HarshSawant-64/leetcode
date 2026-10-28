class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = k-1;
        double maxAveragesum = 0;
        
        // phele subarray ka sum lene ke liye;
        for(int i = low; i<=high ; i++){
            maxAveragesum =   maxAveragesum + nums[i]; // it can be written as += operator in shortcut
        }
         double result = maxAveragesum;
         // Slide the window
            while (high < nums.length - 1) {
                

                low++;
                high++;
                maxAveragesum -= nums[low-1];

                maxAveragesum += nums[high];

                result = Math.max(result, maxAveragesum);
            }

        
     return result/k;
    }
}   