class Solution {
    public boolean judgeSquareSum(int c) {
        long p=0,q=(long)Math.sqrt(c);
        while(p<=q){
            long sum=(p*p)+(q*q);
            if(sum==c)
                return true;
            else if(sum<c)
                p++;
            else
                q--;
        }
        return false;
    }
}