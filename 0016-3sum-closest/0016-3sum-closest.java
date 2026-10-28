class Solution {
    public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int mindiff = Integer.MAX_VALUE;
            int closestSum = 0;
            for(int i = 0 ; i<nums.length-2 ; i++){
                int left = i+1;
                int right = nums.length - 1;
                while(left < right){
                    int sum = nums[i]+nums[left]+nums[right];
                    int diff = Math.abs(target-sum);

                    if(diff<mindiff){
                        mindiff = diff;
                        closestSum=sum;
                    }
                    if(sum == target){
                        return sum;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        return closestSum;  
    }
}