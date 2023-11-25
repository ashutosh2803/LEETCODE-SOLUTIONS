class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int sum[] = new int[n];
        int ans[] = new int[n];
        sum[0] = nums[0];
        for(int i = 1; i<n; i++)
            sum[i] = sum[i-1]+nums[i];
        ans[0] = sum[n-1] - ( (n-1)*nums[0] ) - sum[0];
        for(int i = 1;i<n;i++){
            ans[i] = ((i+1)*nums[i])-( (n-i-1)*nums[i] ) + sum[n-1] - sum[i] -sum[i];
        }
        return ans;
    }
} 