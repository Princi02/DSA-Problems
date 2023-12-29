class Solution {
    public int minCost(String colors, int[]neededTime) {
        int time=0,prevMax=0;
        for(int i=0;i<colors.length();i++){
            if(i>0 && colors.charAt(i-1)!=colors.charAt(i)){
                prevMax=0;
            } 
            int curr=neededTime[i];
            time+=Math.min(curr,prevMax);
            prevMax=Math.max(curr,prevMax);
            
            
        }
        return time;
    }
}