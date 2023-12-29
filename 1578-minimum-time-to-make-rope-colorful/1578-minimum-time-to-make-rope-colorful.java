class Solution {
    public int minCost(String colors, int[] nT) {
        int time=0,prev=0;
        for(int i=0;i<colors.length();i++){
            if(i>0 && colors.charAt(i-1)==colors.charAt(i)){
                time+=Math.min(nT[i],prev);
                prev=Math.max(nT[i],prev);
            } 
            else{
                prev=0;
                time+=Math.min(nT[i],prev);
                prev=Math.max(nT[i],prev);
            }
            
            // int curr=neededTime[i];
            // time+=Math.min(curr,prev);
            // prev=Math.max(curr,prev);
            
            
        }
        return time;
    }
}