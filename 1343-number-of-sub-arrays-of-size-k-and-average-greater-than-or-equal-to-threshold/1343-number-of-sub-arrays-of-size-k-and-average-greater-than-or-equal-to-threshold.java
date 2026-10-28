class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int low = 0;
        int high = k -1;
        int result = 0;
        int sum = 0;
        // sum lene ke liye, phele wala sum.
        for(int i = low; i<=high ; i++){
            sum += arr[i];
        }
        
        while(high < arr.length){
            if(sum >= threshold*k){
                result++;
            }
                if (high == arr.length - 1) {
                break;
            }
                sum -= arr[low];
                low++;
                high++;
                sum += arr[high];   
        }
        return result;
        
    }
}