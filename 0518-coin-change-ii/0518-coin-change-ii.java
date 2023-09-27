class Solution {
    public int change(int amount, int[] coins) {
        int combinations[]=new int[amount+1];
        combinations[0]=1;
        
        // 1st
        // for(int i=0;i<coins.length;i++){
        //         for(int j=coins[i];j<amount+1;j++){
        //         combinations[j]+=combinations[j-coins[i]];
        //     }
        // }
        // return combinations[amount];
        
        // 2nd
        for(int coin : coins){
            for(int i=0;i<amount+1;i++){
                if(i>=coin){
                    combinations[i]+=combinations[i-coin];
                }
            }
        }
        return combinations[amount];
    }
}