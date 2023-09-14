class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int matrix1[][]=new int[m][n];
       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // System.out.println(Arrays.toString(matrix[0]));
        // System.out.println(Arrays.toString(matrix[1]));
        // System.out.println(Arrays.toString(matrix[2]));
        for(int i=0;i<matrix.length;i++){
             int p=0,k=matrix[0].length-1,j=0;           
            while(p<k){
                    int temp=matrix[i][p];
                    matrix[i][p]=matrix[i][k];
                    matrix[i][k]=temp;
                p++;
                k--;              
                }
            } 
    }
}