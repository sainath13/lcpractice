class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        //Reduction of B to max count string  
        int[] bMax = new int[26];
        for(String b : B){
            int[] btemp = countChar(b);
            for(int i = 0 ; i < 26 ; i++){
                bMax[i] = Math.max(btemp[i],bMax[i]);
            }
        }
        List<String> ans = new ArrayList();
        search: for(String s : A){
            int[] t = countChar(s);
            for(int i = 0; i < 26; i++){
                if(t[i]<bMax[i]){
                    continue search; //this is why something like goto was required here 
                }
            }
            ans.add(s);
        }
        return ans;
    }
    
    public int[] countChar(String s){
        int[] bt = new int[26];
        for(char c : s.toCharArray()){
            bt[c - 'a']++;
        }
        return bt;
    }
}
