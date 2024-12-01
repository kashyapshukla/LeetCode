class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        return helper(m,n,0,0,dp);
        
    }

    private int helper( int m, int n,int i,int j, int[][] dp){
        if(m-1==i && n-1==j){
            return 1;
        }
        if(m==i || n==j){
            return 0;
        }


        if(dp[i][j]!=-1){
            return dp[i][j];
        }

     

        return dp[i][j]= helper(m,n,i+1,j,dp)+helper(m,n,i,j+1, dp);        
    }
}