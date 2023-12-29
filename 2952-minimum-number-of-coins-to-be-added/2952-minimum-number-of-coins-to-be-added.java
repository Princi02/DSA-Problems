class Solution {
    public int minimumAddedCoins(int[] coins, int k) {
        int n=coins.length;
        int count=0, curr=1;
        Arrays.sort(coins);
        for(int i=0 ; i<n && curr<=k ; i++){
            if(curr>=coins[i]) curr+=coins[i];
            else{
                count++;
                curr*=2;
                i--;
            }
        }
        while(curr<=k){
            count++;
            curr*=2;
        }
        return count;
    }
}