class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
//         wrong one
//         int target[]=new int[nums.length];
//         for(int i=0;i<index.length;i++){
//             if(target[index[i]]!=nums[i]){
               
//                 int j=index[i];
//                 int p=nums[i];
//                  // System.out.println(i);
//                 while(j<target.length){
//                     int temp=target[j];
//                     target[j]=p;
//                     p=temp;
//                     j++;
//                 }
                
//             }
//             else{
//                 target[index[i]]=nums[i];
//                  System.out.println(i);
//             }
            
//         }
//         return target;
        
        ArrayList<Integer> list=new ArrayList<>();
        int target[]=new int[nums.length];
        for(int i=0;i<index.length;i++){
            list.add(index[i],nums[i]);
        }
         for(int i=0;i<index.length;i++){
             target[i]=list.get(i);
         }
        return target;
    }
}