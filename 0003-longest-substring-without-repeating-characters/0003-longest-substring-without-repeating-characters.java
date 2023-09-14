class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<Character>();
        int j=0 ,i=0 , count=0;
        while(i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                count=Math.max(count,set.size());
            }
            else{
                set.remove(s.charAt(j++));
            }
        }
        return count;
    }
}