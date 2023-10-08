class Solution {
    Integer dp[][];
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int min1 = 1001, min2 = 1001, max1 = -1001, max2 = -1001;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] < min1){
                min1 = nums1[i];
            }

            if(nums1[i] > max1){
                max1 = nums1[i];
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] < min2){
                min2 = nums2[i];
            }

            if(nums2[i] > max2){
                max2 = nums2[i];
            }
        }

        if(max1 < 0 && min2 > 0){
            return max1 * min2;
        }
        if(min1 > 0 && max2 < 0){
            return min1 * max2;
        }


        dp = new Integer[nums1.length][nums2.length];
        int i = 0, j = 0;
        return dotProduct(i, j, nums1, nums2);
    }

    public int dotProduct(int i, int j, int[] a, int[] b){
        if(i == a.length || j == b.length){
            return 0;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        int both = a[i] * b[j] + dotProduct(i+1, j+1, a, b);
        int firstExclude = dotProduct(i+1, j, a, b);
        int secondExclude = dotProduct(i, j+1, a, b);
        dp[i][j] = Math.max(both, Math.max(firstExclude, secondExclude));
        return dp[i][j];
    }
}