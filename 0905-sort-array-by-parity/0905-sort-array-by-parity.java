class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int c=0;
        int arr[]=new int[nums.length];
        int l=nums.length, j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                c++;
                arr[l-1]=nums[i];
                l--;
            }
            else{
                arr[j]=nums[i];
                j++;
            }
                
        }
        if(c==nums.length) return nums;
        return arr;
    }
}