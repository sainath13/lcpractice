class Solution {
    public void moveZeroes(int[] nums) {
        int real = 0;
        for(int i = 0; i < nums.length; i++){
        if(nums[i]!=0){
                nums[real] = nums[i];
                real++;
            
        }
        }
        for(; real< nums.length; real++){
            nums[real] = 0;
        }
    }
}
