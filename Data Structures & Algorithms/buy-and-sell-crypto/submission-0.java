class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int min_stock=Integer.MAX_VALUE;
        int max_stock=0;
        for(int i=0;i<prices.length;i++){
            min_stock=Math.min(prices[i],min_stock);
            max_stock=Math.max(max_stock,prices[i]-min_stock);
        }
        return max_stock;
        
    }
}
