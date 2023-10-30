class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        // HashSet<Character> set=new HashSet<Character>();
        // for(char c : jewels.toCharArray()){
        //     set.add(c);
        // }
        // for(int i=0;i<stones.length();i++){
        //     if(set.Contains(stones.charAt(i))){
        //         c++;
        //     }
        // }
        // return c;
        for(char j : jewels.toCharArray()){
            for(char s : stones.toCharArray()){
                if(s==j) c++;
            }
        }
        return c;
    }
}