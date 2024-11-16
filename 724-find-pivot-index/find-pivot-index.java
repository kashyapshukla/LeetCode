class Solution {
    public int pivotIndex(int[] nums) {

        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        
        int sum=0;
        left[0]=sum;
        for(int i=1;i<nums.length;i++){
            left[i]=sum+nums[i-1];
            sum=left[i];
        }

        sum=0;
        right[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            right[i]=sum+nums[i+1];
            sum=right[i];
        }
        for(int i=0;i<nums.length;i++){
            if (left[i]==right[i]){
                return i;
            }
        }

        return -1;
    }
}