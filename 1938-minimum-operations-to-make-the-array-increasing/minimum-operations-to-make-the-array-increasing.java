class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        int max=nums[0];

        for(int i= 1;i<nums.length;i++){
                if(nums[i]<max+1){

                    ans= ans+(max+1-nums[i]);
                    max=max+1;

                }
                else{
                    max=nums[i];

                }

        }

        return ans;
        
    }
}