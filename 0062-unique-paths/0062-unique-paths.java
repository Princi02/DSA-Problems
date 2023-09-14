class Solution {
    public int uniquePaths(int m, int n) {
        
        // 1st method
        
        int arr[][]=new int[m][n];
        for(int[] ar : arr){
            Arrays.fill(ar,1);
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[m-1][n-1];
        
        
        // 2nd method
        
        
        
        
        
        
    }
}