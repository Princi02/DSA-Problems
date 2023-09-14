class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        if(nums.length==0) return 0;
        int max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1){
                c++;
                max=Math.max(max,c);
            }
            else if(nums[i]==nums[i+1])
                continue;
            else
                c=1;               
            
        }
        return max;
    }
}