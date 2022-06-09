class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int check = target - nums[i];
            if(hm.containsKey(check)){
                result[0] = i;
                result[1] = hm.get(check);
                break;
            }
            hm.put(nums[i], i);
        }
        return result;
    }
}