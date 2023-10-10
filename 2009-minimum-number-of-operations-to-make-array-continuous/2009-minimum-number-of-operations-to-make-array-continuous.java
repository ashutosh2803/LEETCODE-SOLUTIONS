class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int len = 1;

        //first removing the duplicate elements from the array
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1]) {
                nums[len++] = nums[i];
            }
        }
//using 2 pointer checking if the condition is met that is diff is nums.length-1
        int uniquelen = nums.length;
        for (int i = 0, j = 0; i < len; ++i) {
            while (j < len && nums[j] - nums[i] <= nums.length - 1) {
                ++j;
            }
            uniquelen = Math.min(uniquelen, nums.length - (j - i));
        }
        
        return uniquelen; 
    }
}