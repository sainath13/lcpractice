class Solution {
    public boolean isPalindrome(int x) {
        //is 1 a palindrom? is single digit a palindrom, i think yes
        if(x < 0){
            return false;
        }
        int org = x;
        int rev = 0;
        while(x!=0){
            int d = x%10;
            x = x/10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE && d > 7)){
                //not a valid int. 
                return false;
            }
            rev = rev*10 + d;
        }
        if(rev == org){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
