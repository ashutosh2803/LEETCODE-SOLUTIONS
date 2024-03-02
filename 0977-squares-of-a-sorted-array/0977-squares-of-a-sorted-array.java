class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] freqBucket = new int[10000 + 1];
        
        for (int num : nums) {
            if (num < 0) {
                freqBucket[-num]++;
            } else {
                freqBucket[num]++;
            }
        }
        
        List<Integer> resList = new ArrayList<>();
        
        for (int num = 0; num < freqBucket.length; num++) {
            if (freqBucket[num] > 0) {
                int numFreq = freqBucket[num];
                while (numFreq-- > 0) {
                    resList.add(num * num);
                }
            }
        }
        
        int[] res = new int[resList.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = resList.get(i);
        }
        
        return res;
    }
}
