class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int max=Integer.MIN_VALUE, c=0;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]%2 != 0){
                c++;
                max=Math.max(max,c);
            }
            else
                c=0;
        }
        System.out.println(c);
        if(max>=3) return true;
        else return false;
    }
}