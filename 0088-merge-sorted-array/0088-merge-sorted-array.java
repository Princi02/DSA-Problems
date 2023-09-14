class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int j=0;
        // for(int i=m+n-1;j<n;i--){
        //     nums1[i]=nums2[j++];
        // }
        // System.out.println(Arrays.toString(nums1));
        // Arrays.sort(nums1);
         int k=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[k];
            k++;
        }
        // System.out.println(Arrays.toString(nums1));
        for(int i=0;i<=nums1.length-2;i++){
            int pos=i;
            for(int j=i+1;j<nums1.length;j++){
            if(nums1[pos]>nums1[j])
                pos=j;
            }
            int c=nums1[pos];
            nums1[pos]=nums1[i];
            nums1[i]=c;
        }
    }
}