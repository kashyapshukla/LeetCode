class Solution {

    int helper(int n, int[] dp){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }

        return dp[n]= helper(n-1,dp)+helper(n-2,dp)+helper(n-3,dp);
    }
    public int tribonacci(int n) {
        int dp[]=new int[n+1];

        if(dp.length>3){
            dp[0]=0;
            dp[1]=1;
            dp[2]=2;
        }
        return helper(n,dp);
        
    }
}