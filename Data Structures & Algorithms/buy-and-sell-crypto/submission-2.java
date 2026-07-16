class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sol = 0;
        for(int price: prices){
            sol = Math.max(sol, price-buy);
            if(price < buy){
                buy = price;
            }
        }
        return sol;
    }
}
