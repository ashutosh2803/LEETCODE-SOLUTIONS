class Solution {
    public int arraySign(int[] nums) {
        int ans = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                return 0;
            }
            if(nums[i] < 0){
                ans = ans * -1;
            }
        }
        return ans;
    }
}