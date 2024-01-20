class Pair{
    int element;
    int numMin;
    Pair(int ele, int nm){
        element=ele;
        numMin=nm;
    }
}

class Solution {
    public int m=1000000007 ;
    
    public int sumSubarrayMins(int[] arr) {
        
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        
        ArrayDeque<Pair> stack1 = new ArrayDeque<>();
        ArrayDeque<Pair> stack2 = new ArrayDeque<>();
        
// for left array
        for(int i=0; i<arr.length; i++){
            int count=1;
            int curr_ele=arr[i];
            while(stack1.size()!=0 && stack1.peek().element>curr_ele){
                count+=stack1.peek().numMin;
                stack1.pop();
            }
            stack1.push(new Pair(curr_ele, count));
            left[i]=count;
        }
        
        
// for right array
        for(int i=arr.length-1; i>=0; i--){
            int count=1;
            int curr_ele=arr[i];
            while(stack2.size()!=0 && stack2.peek().element>=curr_ele){
                count+=stack2.peek().numMin;
                stack2.pop();
            }
            stack2.push(new Pair(curr_ele, count));
            right[i]=count;
        }
        
        long ans=0;
        for(int i=0;i<arr.length;i++){
            ans = (ans + (long) arr[i]*left[i]*right[i])%m;
        }
        return (int)ans;
        
    }
}