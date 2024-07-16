class Solution {
    public int maxProfit(int[] prices) {
        int s=prices[0],max = 0;
        for(int i=1;i<prices.length;i++){
            if(s>prices[i]){
                s = prices[i];
            }else{
                max = Math.max(max,prices[i]-s);
            }
        }
        return max;
    }
}
