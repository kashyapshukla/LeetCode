class Solution {


    int helper(int[] nums, int i, int[] dp){
        if(nums.length<=i){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=nums[i]+ Math.max(helper(nums,i+2,dp),helper(nums, i+3,dp));
        
    }
    public int rob(int[] nums) {
        

        int[] dp=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            dp[i]=-1;
        }
        return Math.max( helper(nums,0,dp), helper(nums,1,dp));
    }
}