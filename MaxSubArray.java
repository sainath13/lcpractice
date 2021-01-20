class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if((currSum + nums[i]) >  nums[i]){  //Math.max is faster by 50% than this shit man
                currSum = currSum + nums[i];
            }
            else{
                currSum = nums[i];
            }
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}


class Solution {
    public int maxSubArray(int[] nums) {
    return helper(nums, 0 , nums.length-1); 
    }
    public int helper(int[] n, int left, int right){
        if(left == right) return n[left];
        
        int mid = (left + right)/2;
        int leftSum = helper(n,left,mid);
        int rightSum = helper(n,mid+1, right);
        int crossSum = crossSum (n,left, right, mid);
        return Math.max(leftSum,Math.max(rightSum,crossSum));
    }
    public int crossSum(int[] n, int left ,int right, int mid){
        if (left == right) return n[left];
        int leftSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = mid ; i > left -1 ; i--){
            currSum += n[i];
            leftSum = Math.max(leftSum,currSum);
        }
        int rightSum = Integer.MIN_VALUE;
        currSum = 0;
        for(int i = mid+1 ; i < right + 1; i++){
            currSum += n[i];
            rightSum = Math.max(rightSum, currSum);
        }
        
        return leftSum + rightSum;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        //modify array is an option. Think about this when you a problem to solve;
        int maxSum = nums[0];
        for(int i = 1; i < nums.length ; i++){
            if(nums[i-1] > 0) nums[i] = nums[i] + nums[i-1];
            maxSum = Math.max(nums[i],maxSum);
        }
        return maxSum;
    }
}
