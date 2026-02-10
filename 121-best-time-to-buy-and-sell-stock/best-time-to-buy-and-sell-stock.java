class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minElement = prices[0];
        int profit = 0;
        for(int i=1;i<n;i++)
        {
            minElement= Math.min(minElement,prices[i]);
            profit = Math.max(profit, prices[i]-minElement);
        }
        return profit;
    }
    
}