class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sol = 0;
        for(int i = 1; i < prices.length; i++){
            sol = Math.max(sol, prices[i]-buy);
            if(prices[i] < buy){
                buy = prices[i];
            }
            //sol = Math.max(sol, prices[i]-buy);
        }
        return sol;
    }
}
