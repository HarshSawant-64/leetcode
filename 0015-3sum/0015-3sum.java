class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i  = 0 ; i< nums.length-2;i++){
            // skip duplictae ekments
            if (i >0 && nums[i]== nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length-1;
            int target = -nums[i];

            while (left < right) {
                int s = nums[left]+nums[right];
                if (s==target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // skip the dupliactes left values
                    while (left<right && nums[left]== nums[left-1]){
                        left++;
                    }
                    // skip the duplicates right value
                    while (left<right && nums[right]== nums[right+1]){
                        right--;
                    }

                } else if (s<target) {
                    left++;
                }else{
                    right--;
                }
            }     
        }
        return result;
    }
}