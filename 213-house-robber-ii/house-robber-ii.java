class Solution {
    public int rob(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }

        if(nums.length==3){
            return Math.max(nums[0],Math.max(nums[1],nums[2]));
        }


        return Math.max(helper(nums,0, nums.length-2), helper(nums,1,nums.length-1));      
    }


    int helper(int nums[], int start, int end){
        int r1=0;
        int r2=0;

        for(int i=start;i<=end;i++){
            int tem=Math.max(r1, nums[i]+r2);
            r2=r1;
            r1=tem;
        }


        return r1;
    }
}