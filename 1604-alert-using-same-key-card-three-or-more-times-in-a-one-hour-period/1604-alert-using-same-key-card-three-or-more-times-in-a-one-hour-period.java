class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String , List<Integer>> mp=new HashMap<>();
        
        for(int i=0;i<keyName.length;i++){
            String hr=keyTime[i].substring(0,2);
            String min=keyTime[i].substring(3);
            int time= (Integer.parseInt(hr)*60)+Integer.parseInt(min);
            if(!mp.containsKey(keyName[i])){
                mp.put(keyName[i],new ArrayList<>());
            }
            mp.get(keyName[i]).add(time);
        }
        
        List<String> ans=new ArrayList<>();
        
        for(Map.Entry<String, List<Integer>> entry : mp.entrySet()){
           List<Integer> list = entry.getValue();
           
           Collections.sort(list, (a, b) -> a - b);
            for(int i=2;i<list.size();i++){
                if(list.get(i)-list.get(i-2) <=60){
                    ans.add(entry.getKey());
                    break;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}