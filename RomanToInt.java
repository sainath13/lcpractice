class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        
        Map<String, Integer> map = new HashMap<>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);
        
        //tochararray increases space 
        int i = 0;
        while(i < s.length()){
            String first = s.substring(i,i+1);
            int firstvalue = map.get(first);
            
            if(i != s.length()-1){
            String second = s.substring(i+1,i+2);
            int secondvalue = map.get(second);
            if(secondvalue > firstvalue){
                sum = sum + (secondvalue - firstvalue);
                i = i + 2;
            }
            else{
                sum = sum + firstvalue;
                i = i + 1;
            }
            }
            else{
                sum = sum + firstvalue;
                i = i + 1;
            }
        }
        return sum;
    }
}
