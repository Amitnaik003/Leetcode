class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // smallest price seen so far
        int maxProfit = 0; // best profit so far

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update min price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // check profit
            }
        }
        
        return maxProfit;
    }
}
