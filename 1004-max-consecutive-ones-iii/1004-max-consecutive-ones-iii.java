class Solution {
    public int longestOnes(int[] nums, int k) {
          //sliding window ka question hai
        // variable window hai
        // data information
        int low = 0;
        int n = nums.length;
        int result = 0;
        int zeroes = 0;
        int ones = 0;

        for (int high = 0; high < n ; high++){
            if (nums[high] == 0){
                zeroes++;
            }else{
                ones++;
            }
            while (zeroes>k){
                if (nums[low]==0){
                    zeroes--;
                }
                low++;
            }
            int len = high - low + 1;
            result = Math.max(result,len);
        }
        return result;
        
    }
}