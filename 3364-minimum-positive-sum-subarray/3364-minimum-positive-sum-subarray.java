class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int result = Integer.MAX_VALUE;   
       
        for(int len = l; len<= r; len++){
            int low = 0;
            int sum = 0;
            int high = len - 1;
            for(int i = low; i<= high ; i++){
                sum = sum + nums.get(i);
            }
            if(sum>0){
                result = Math.min(result,sum); 
                }
            while(high<  nums.size()-1){
                sum -= nums.get(low);
                low++;
                high++;
                sum += nums.get(high);
                    if (sum > 0) {
                        result = Math.min(result, sum);
                    }
                } 
            }
            // if(result == Integer.MAX_VALUE){
            //     return -1;
            // }else{
            //     return result;
            // }
            return result == Integer.MAX_VALUE ? -1 : result;
    }
}