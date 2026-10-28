class Solution {
    public int[] sortedSquares(int[] nums) {
        int negative = 0;
        int positive = 0;
        //Count negative and postive numbers

        for (int i = 0; i<nums.length;i++){
            if (nums[i]<0){
                negative++;
            }else {
                positive++;
            }
        }
        int []a = new int[negative];
        int []b = new int[positive];
        int x = 0 , y = 0;
        // traversing loops for nums array
        for (int i = 0;i< nums.length;i++){
            if (nums[i]<0){
                a[x++] = nums[i];
            }else {
                b[y++] = nums[i];
            }
        }
        //case1
        // purra array postive hoo
        if (a.length == 0){
            //sqaure kar do
            for (int i = 0; i< nums.length;i++){
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        }
        //case 2
        // purra array negative ho to
        if (b.length == 0){
            //square kar do
            for (int i =0;i< nums.length;i++){
                nums[i] = nums[i]*nums[i];
            }
            // reverse kar do
            int i = 0,  j = nums.length - 1;
            while (i<j){
                int swapValue = nums[i];
                nums[i]= nums[j];
                nums[j] = swapValue;
                i++;
                j--;
            }
            return nums;
        }
        //case 3
        // arrays negative or positive dono hot toh
        int i = 0, j=0;

        int n1 = a.length;
        int n2 = b.length;
        int left = 0 , right = n1 -1;

        int[]res = new int[n1+n2];
        // squaring negative and reverse them
        for (int k = 0;k<n1;k++){
            a[k]  =a[k]*a[k];
        }
        while (left<right){
            int swapValue = a[left];
            a[left] = a[right];
            a[right] = swapValue;
            left++;
            right--;
        }
        // Squaring for postive numbers
        for (int k = 0; k<n2 ;k++){
            b[k] = b[k]*b[k];
        }
        // merge two sorted lists
        int id = 0;
        while (i<n1 && j<n2){
            if (a[i] <= b[j]){
                res[id++] = a[i++];
            }else {
                res[id++] = b[j++];

            }
        }
        while (i < n1){
            res[id++] = a[i++];
        }
        while(j<n2){
            res[id++] = b[j++];
        }
        return  res;
        
    }
}