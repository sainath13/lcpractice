class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1){
            return;
        }
        
        int len = nums.length;
        k = k%len;
        
        for(int i = 0; i < len/2; i++){
            int temp = nums[i];
            nums[i] = nums[len-i-1];
            nums[len-i-1] = temp;
        }
        for(int i = 0; i < k/2; i++){
            int temp = nums[i];
            nums[i] = nums[k-i-1];
            nums[k-i-1] = temp;
        }
        int loopcount = (len - k)/2; //effective len of array divide by 2
        for(int i = k, j = 0 ;  j < loopcount ; i++,j++){
            int temp = nums[i];
            nums[i] = nums[len -j -1];
            nums[len -j - 1] = temp;
        }
        
    }
}
