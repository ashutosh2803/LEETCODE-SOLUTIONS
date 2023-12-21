class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {

        int n = points.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = points[i][0];
        }
        
        Arrays.sort(arr);
        int ans = arr[1] - arr[0];
        for(int i=2;i<n;i++) {
          if(arr[i]-arr[i-1] > ans) {
              ans = arr[i] - arr[i-1];
          }
        }

        return ans;
    }
}