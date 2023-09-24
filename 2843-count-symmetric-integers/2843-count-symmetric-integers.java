class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low; i<=high; i++){
            if(isSymmetric(i))
                count++;
        }  
        return count;
    }
        
        public boolean isSymmetric(int i){
            String str=Integer.toString(i);
            if(str.length()%2==1) return false;
            int suml=0;
            int sumh=0;
            for(int j=0;j<str.length()/2;j++){
                 suml+=Character.getNumericValue(str.charAt(j));
                 sumh+=Character.getNumericValue(str.charAt(str.length()-1-j));
            }
            return suml==sumh;
        }
        
}