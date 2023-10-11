class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int s=0;
        for(int j : set){
            nums[s]=j;
            System.out.println(nums[s]+" "+j);
            s++;     
        }
        // Arrays.sort(nums);
        int ans=nums.length;
        for(int i=0,j=0; i<set.size(); ++i){
            while(j < set.size() && nums[j] - nums[i] <= nums.length-1){
                ++j;
            }
            ans = Math.min(ans, nums.length - (j-i));
        }
        return ans;
    }
}