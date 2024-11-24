class Solution {
    int num(int i,int j, String word1, String word2,int dp[][]){
        if(i<0) return j+1;
        if(j<0) return i+1;


        if(dp[i][j]!=-1){
            return dp[i][j];
        }
         
        if(word1.charAt(i)==word2.charAt(j)){
           
            return  dp[i][j]=0+num(i-1,j-1, word1,word2,dp);
        }
        

       

        return dp[i][j] =1+ Math.min(Math.min(num(i-1,j, word1,word2,dp),num(i,j-1, word1,word2,dp)),num(i-1,j-1, word1,word2,dp));
    }

    public int minDistance(String word1, String word2) {

        int i=word1.length();
        int j=word2.length();
        int dp[][]=new int[i][j];

        for(int k=0;k<i;k++){
            for(int v=0;v<j;v++){
                dp[k][v]=-1;
            }
        }

        return num(i-1,j-1,word1,word2,dp);
        
    }
}