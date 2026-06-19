//Best time to buy & sell stock LC -121
//TC - O(n)
//SC - O(1)

class BuySellStock{
    public int maxProfit(int[] prices){
        int buy = prices[0];
        int maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(buy > prices[i]{
             buy = prices[i];   
            }
            if(buy < prices[i]){
                int profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}