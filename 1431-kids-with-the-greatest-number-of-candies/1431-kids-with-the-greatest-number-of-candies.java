class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++){
            greatest = Math.max(candies[i], greatest);
        }
        for(int i = 0; i < candies.length; i++){
            int sum = candies[i] + extraCandies;
            if(sum >= greatest){
                ans.add(true);
            } else{
                ans.add(false);
            }
        }
        return ans;
    }
}