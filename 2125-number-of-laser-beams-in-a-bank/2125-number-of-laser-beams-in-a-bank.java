class Solution {
    public int numberOfBeams(String[] bank) {
        
        int c=0;
        int arr[]=new int[bank.length];
        for(int i=0;i<bank.length;i++){
           int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j) == '1') count++;
            }
            if(count!=0){
                arr[c]=count;
                c++;
            } 
        }
        if(c>=1){
            int sum=0;
            for(int i=1;i<arr.length;i++){
                int mul=arr[i-1]*arr[i];
                sum+=mul;
            }
            return sum;
        }
        return 0;
    }
}