class Solution {
    public int maxSubArray(int[] nums) {
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            max_ending_here += nums[i];
            if(max_so_far < max_ending_here)
                max_so_far=max_ending_here;
            if(max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}