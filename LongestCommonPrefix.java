class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String lcp = strs[0];
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].indexOf(lcp) != 0){
                lcp = lcp.substring(0,lcp.length()-1);
                while(lcp.length() > 0 && strs[i].indexOf(lcp) != 0){
                    lcp = lcp.substring(0,lcp.length()-1);
                }
            }
        }
        return lcp;
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        
        //write bad code first. bad code is still code
        
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length;j++){
                if(i == strs[j].length() || c!=strs[j].charAt(i)){
                    return strs[0].substring(0,i); //accepts index not length
                }
            }
        }
        return strs[0];
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        return longestCommonPrefix(strs,0,strs.length-1);
    }
    public String longestCommonPrefix(String[]strs,int l, int r){
        if(l==r){
            return strs[l];
        }
        int mid = (l+r)/2;
        String left = longestCommonPrefix(strs,l,mid);
        String right = longestCommonPrefix(strs,mid+1,r);
        return common(left,right);
    }
    public String common(String l, String r){
        int minlen = Math.min(l.length(), r.length());
        for(int i = 0; i < minlen ; i++){
            if(l.charAt(i)!=r.charAt(i)){
                return l.substring(0,i); //end index is exclusive for gods sake. It is half open like most things in java
            }
        }
        //return l; //sad to see you lose but cant help
        return l.substring(0,minlen);
    }
}


