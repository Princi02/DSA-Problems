class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length;
        int n=matrix.length;
        int start=0;int end=m*n-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            int val=matrix[mid/m][mid%m];
            System.out.println(mid);
            System.out.println(val);
            if(val==target) return true;
            if(val<target) start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}