class Solution {
    public int maxProduct(int[] nums) {
        int maxResult = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    int result = (nums[i] - 1) * (nums[j] - 1);
                    maxResult = result > maxResult ? result : maxResult; 
                }
            }
        }
        return maxResult;
    }
}