class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int rows=obstacleGrid.length;
        int cols=obstacleGrid[0].length;

        int dp[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                dp[i][j]=-1;
            }
        } 

        return helper(obstacleGrid,0,0, dp);       
    }


    int helper(int[][] nums,int row, int col, int[][] dp){
        if( row>=nums.length || col>=nums[0].length || nums[row][col]==1 ){
            return 0;
        }

        if(row==nums.length-1 && col==nums[0].length-1){
            return 1;
        }

        if(dp[row][col]!=-1){
            return dp[row][col];
        }


        return dp[row][col]= helper(nums, row+1, col,dp) + helper(nums, row, col+1, dp);
    }
}