class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int start=0;
        int end=height.length-1;
        while(end>start){
            int len=end-start;
            int hi=Math.min(height[start], height[end]);
            ans=Math.max(ans, len*hi);

            if(height[end]==height[start]){
                start++;
                end--;
            }else if(height[end]>height[start]){
                start++;
            }else{
                end--;
            }
        }
        return ans;
    }
}