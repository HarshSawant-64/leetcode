class Solution {
    public int removeElement(int[] nums, int value) {
        int i = 0, j = 0;
        while(j< nums.length){
            if (nums[j] != value){
                nums[i]=nums[j];
                j++;
                i++;
            }else {
                j++;
            }
        }
        return i;
    }
}