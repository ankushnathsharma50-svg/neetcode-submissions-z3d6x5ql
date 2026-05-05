class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int ele : prices){
            if(ele < minPrice){
               minPrice = ele;
            }
            if(ele - minPrice > maxProfit){
                maxProfit = ele - minPrice;
            }
        }
        return maxProfit;
    }
}
