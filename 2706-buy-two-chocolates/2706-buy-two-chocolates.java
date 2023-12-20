class Solution {
    public int buyChoco(int[] prices, int money) {
        int first=Integer.MAX_VALUE, second= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(first>=prices[i]){
                second=first;
                first=prices[i];
            }
            else if(prices[i]<second&&prices[i]>first){
                second= prices[i];
            }
        }
        int ans= money-first-second;
        return ans<0?money:ans;
        
    }
}