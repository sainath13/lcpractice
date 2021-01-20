class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        Map<String, List> ds = new HashMap<>();
        for(String str: strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(ds.containsKey(key)){
                ds.get(key).add(str);
            }
            else{
                ds.put(key,new ArrayList());
                ds.get(key).add(str);
            }
        }
        
        return new ArrayList(ds.values());
    }
}


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        Map<String,List> ds = new HashMap<>();
        for(String s : strs){
            char[] ca = s.toCharArray();
            int[] counta = new int[26];
            Arrays.fill(counta, 0);
            for(char c : ca){
                counta[c - 'a']++;
            }
            String key = "";
            for(int c : counta){
                key += c + "#";
            }
            if(ds.containsKey(key)){
                ds.get(key).add(s);
            }
            else{
                ds.put(key,new ArrayList());
                ds.get(key).add(s);
            }
        }
        return new ArrayList(ds.values());
    }
}


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        Map<String,List> ds = new HashMap<>();
        for(String s : strs){
            char[] ca = s.toCharArray();
            int[] counta = new int[26];
            Arrays.fill(counta, 0);
            for(char c : ca){
                counta[c - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int c : counta){
                 sb.append('#');
                 sb.append(c);
            }
            String key = sb.toString();
            if(ds.containsKey(key)){
                ds.get(key).add(s);
            }
            else{
                ds.put(key,new ArrayList());
                ds.get(key).add(s);
            }
        }
        return new ArrayList(ds.values());
    }
}



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        Map<String,List> ds = new HashMap<>();
        for(String s : strs){
            char[] ca = s.toCharArray();
            int[] counta = new int[26];
            Arrays.fill(counta, 0);
            for(char c : ca){
                counta[c - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder(); //having string build is much slower than sorting elements. 
            for(int c : counta){
                 sb.append('#');
                 sb.append(c);
            }
            String key = sb.toString();
            if(ds.containsKey(key)){
                ds.get(key).add(s);
            }
            else{
                ds.put(key,new ArrayList());
                ds.get(key).add(s);
            }
        }
        return new ArrayList(ds.values());
    }
}

