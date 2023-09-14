class Solution {
    public int findDuplicate(int[] arr) {
       
        for(int i=0;i<arr.length;i++){
            
            int chkIdx=Math.abs(arr[i]);
            if(arr[chkIdx-1]<0) return chkIdx;
            else {
                arr[chkIdx-1]*=-1;
            }
        }
        return 1;
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]==arr[i+1])
        //         return arr[i];
        // }
        // return 1;
    }
}