class Solution {
    public int maxProfit(int[] prices) {

        int profit=0;

        int low=prices[0]; //7

        for(int i=1;i<prices.length;i++){
            //update the profit
            profit=Math.max(profit, prices[i]-low); //0 
            //update the low value
            low=Math.min(low,prices[i]); //1
        }

        return profit;
        
    }
}