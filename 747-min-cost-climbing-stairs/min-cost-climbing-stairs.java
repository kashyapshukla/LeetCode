class Solution {

    int helper(int[] cost,int[] dp, int i){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        return dp[i]=cost[i]+Math.min(helper(cost, dp,i+1), helper(cost,dp,i+2));
    }
    public int minCostClimbingStairs(int[] cost) {

        int dp[]=new int[cost.length];

        for(int i=0; i<cost.length;i++){
            dp[i]=-1;
        }

        return Math.min(helper(cost, dp, 0), helper(cost,dp,1));
        
    }
}