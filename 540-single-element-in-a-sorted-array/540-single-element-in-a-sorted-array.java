class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.replace(nums[i], hm.get(nums[i]) + 1);
            }else{
                hm.put(nums[i], 1);
            }
        }
        System.out.println(hm);
        for(Map.Entry e : hm.entrySet()){
            if((int)e.getValue() == 1){
                return (int)e.getKey();
            }
        }
        return -1;
    }
}