class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> l=new ArrayList<Integer>();
            int v=1;
            for(int j=0;j<=i;j++){
                l.add(v);
                v = (i-j)*v/(j+1);
            }
            list.add(l);
        }
        return list;
    }
    
//     public long fact(long a){
//         long fact=1;
//         for(long i=1;i<=a;i++)
//             fact*=i;
//         return fact;
        
//         }
}