class Solution {
    
    int helper(String text1, String text2, int t1_len, int t2_len, int[][] dp){
       
       //base condition
       if(t1_len<0 ||t2_len<0){
        return 0;
       }
       
       if(dp[t1_len][t2_len]!=-1){
        return dp[t1_len][t2_len];
       }
       //char matches
  
       if(text1.charAt(t1_len)==text2.charAt(t2_len)){
            return dp[t1_len][t2_len]= 1+helper(text1,text2,t1_len-1,t2_len-1,dp);
       }
       //char not matche
       return dp[t1_len][t2_len]=  Math.max(helper(text1,text2,t1_len-1,t2_len,dp),helper(text1,text2,t1_len,t2_len-1,dp));
    }

    public int longestCommonSubsequence(String text1, String text2) {
          
          int t1_len=text1.length()-1;
          int t2_len=text2.length()-1;

          int[][] dp=new int[text1.length()][text2.length()];

          for(int i=0;i<t1_len+1;i++){
            for(int j=0;j<t2_len+1;j++){
                dp[i][j]=-1;
            }
          }

        return helper(text1, text2,t1_len ,t2_len,dp);
    }
}




