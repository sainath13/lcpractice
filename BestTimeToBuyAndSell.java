class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int high = prices[0];
        int profit = 0;
        int i = 0; //why would you want to start array with index 0;
        while(i < prices.length - 1){
            while(i < prices.length -1 && prices[i] >= prices[i+1]){
                i++;
            }
            low = prices[i];
            
            while(i< prices.length -1 && prices[i] <= prices[i+1]){
                i++;
            }
            high = prices[i];
            
            profit += high -low;
        }
        return profit;
    }

}

class Solution {
    public int maxProfit(int[] prices) {
    int profit = 0;
    for(int i = 1 ; i < prices.length; i++){
        if(prices[i-1] < prices[i]){
            profit += prices[i] - prices[i-1];
        }
    }
    return profit;
    }
}


