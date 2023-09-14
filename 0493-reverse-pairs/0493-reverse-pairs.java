class Solution {
    int cnt=0;
    public int reversePairs(int[] nums) {
       return mergesort(nums,0,nums.length-1);     
    }
    
    
    public int countpairs(int[] nums, int low, int mid, int high){
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && 0.5*nums[i] > nums[right]) right++;
            cnt+=right-(mid+1);
        }
        return cnt;
    }
    
    
    public void merge(int[] nums, int low, int mid, int high){
        int left=low , right=mid+1;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right])
                arr.add(nums[left++]);
            else
                arr.add(nums[right++]);
        }
        while(left<=mid)
            arr.add(nums[left++]);
        
         while(right<=high)
            arr.add(nums[right++]);
        
        for(int i=low;i<=high;i++){
            nums[i]=arr.get(i-low);
        }
    }
    
    
   public int mergesort(int[] nums, int low, int high){
        int cnt=0;
       if(low>=high) return 0;
        int mid=(high+low)/2;
       cnt+=mergesort(nums,low,mid);
       cnt+=mergesort(nums,mid+1,high);
       cnt+=countpairs(nums,low,mid,high);   
       merge(nums,low,mid,high);
       return cnt;
    }
    
}