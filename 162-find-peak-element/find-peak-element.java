class Solution {
    public int findPeakElement(int[] nums) {

        int start=0;
        int end=nums.length-1;
        if(nums.length==1){
            return 0;
        }

        while(start<=end){
            if(nums[start]>nums[start+1]){
                return start;
            }
            start++;

            if(nums[end]>nums[end-1]){
                return end;
            }
            end--;
        }

        return 0;
        
    }
}


//[1,2,1,3,5,6,4]
// s           e