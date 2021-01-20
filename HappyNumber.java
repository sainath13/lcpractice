class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        //seen.add(n);
        int sum = getSum(n);
        while(sum!=1 && !seen.contains(sum)){
            seen.add(sum);
            sum = getSum(sum);
        }
        return (sum == 1) ? true : false;
    }
    public int getSum(int n){
        int sum = 0 ;
        while(n>0){
            int d = n%10;
            n = n/10;
            sum = sum + d*d;
        }
        return sum;
    }
}
