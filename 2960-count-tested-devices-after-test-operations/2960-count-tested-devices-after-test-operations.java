class Solution {
    public int countTestedDevices(int[] bP) {
        int count=0;
        for(int i=0;i<bP.length;i++){
            if(bP[i]>0){
                count++;
                for(int j=i+1;j<bP.length;j++){
                    bP[j]--;
                }
            }
        }
        return count;
    }
}