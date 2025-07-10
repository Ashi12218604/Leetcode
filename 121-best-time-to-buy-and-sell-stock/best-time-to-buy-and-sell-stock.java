class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int maxp=0;
        for(int i=0;i<prices.length;i++)
        {
            int currp=prices[i]-mini;
            maxp=Math.max(maxp,currp);
            mini=Math.min(mini,prices[i]);
        }
        return maxp;
    }
}