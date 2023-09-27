class Solution {
    public int change(int amount, int[] coins) {
        int combinations[]=new int[amount+1];
        combinations[0]=1;
        for(int i=0;i<coins.length;i++){
                for(int j=coins[i];j<amount+1;j++){
                combinations[j]+=combinations[j-coins[i]];
            }
        }
        return combinations[amount];
    }
}