class Solution {
    int helper(int mid, int[] piles){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+=Math.ceil((double) piles[i]/mid);
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);
        int start=1;
        int end=piles[piles.length-1];

        while(start<=end){
           int mid=start+(end-start)/2;
           int time= helper(mid, piles);

           if(time<=h){
            end=mid-1;
           }else{
            start=mid+1;
           }

        }
        return start;    
    }
}