class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low; i<=high; i++){
            String str=Integer.toString(i);
            int suml=0, sumh=0, j=0, l=str.length();
            
            if(str.length()%2==0){
                while(j<l/2){
                    
                    suml+=Character.getNumericValue(str.charAt(j));
                    sumh+=Character.getNumericValue(str.charAt(l-1-j));
                    j++;
                }
                if(suml==sumh){
                    count++;
                }       
            }
            }
        return count;
        }
}