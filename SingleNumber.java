//map two pass
Class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> ds = new HashMap<>();
        for (int i : nums){
            if(ds.containsKey(i)){
                int count = ds.get(i);
                ds.replace(i,count+1);
            }
            else{
                ds.put(i,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : ds.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0; 
    }
}



class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> htable = new HashMap<>();
        for( int i : nums){
            htable.put(i,htable.getOrDefault(i,0) +1);
        }
        for(int i : nums){
            if(htable.get(i) == 1){
                return i;
            }
        }
        return 0; 
    }
}

//MATH HACK


class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        int setSum = 0, sumSum = 0;
        for (int i : nums){
            if(!set.contains(i)){
                set.add(i);
                setSum+=i;
            }
            sumSum+=i;
        }
        
        return 2*setSum - sumSum;  
    }
}

//BIT HACK
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor=xor^num;
        }
        return xor;
    }
}
