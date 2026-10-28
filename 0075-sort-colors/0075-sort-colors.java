class Solution {
    public void sortColors(int[] nums) {
            int low = 0;
            int mid=0;
            int high = nums.length-1;

            while (mid<=high){
                // then swap the mid with high and move low ++ and mid++;

                if (nums[mid] == 0){
                    int temp = nums[low];
                    nums[low]=nums[mid];
                    nums[mid]= temp;
                    low++;
                    mid++;
                }
                else if (nums[mid] == 1){
                    // best case
                    mid++;
                }
                else {
                    // here mid > higher which becomes a probleMatic condition
                    int temp = nums[mid];
                    nums[mid]=nums[high];
                    nums[high] = temp;
                    high --;
                }
            }
    }
}