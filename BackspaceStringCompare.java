class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> ts = new Stack<>();
        String Sf, Tf; //(final)
        for(char c : S.toCharArray()){
            if(c == '#'){
                if(!ss.isEmpty()){
                    ss.pop();
                }
            }
            else {
                ss.push(c);
            }
        }
        
        for(char c : T.toCharArray()){
            if(c == '#'){
                if(!ts.isEmpty()){
                    ts.pop();
                }
            }
            else {
                ts.push(c);
            }
        }
        return ss.equals(ts);
    }
}
