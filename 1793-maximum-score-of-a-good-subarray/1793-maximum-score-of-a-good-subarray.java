class Solution {
    public int maximumScore(int[] nums, int k) {
        // return greedy(nums, k); // obvious approch to go with is greedy only for this question

        // another great idea to solve this problem is
        // create prefix min of left and right side of array
        // now, assume to most minimum value will exist in right side
        // traverse 1 by 1 in right side and for each right value, check
        // how many possible elements we can take from left side.
        // using binary search bcz it is sorted in assending
        // do same thing after reversing the array as well
        // because minimum element could be present in left side as well.

        return lendyApproach(nums, k);
    }

    public int greedy(int[] arr, int k) {
        int i = k;
        int j = k;
        int n = arr.length;
        int curr = arr[k];
        int ans = arr[k];
        while ( i > 0 || j < n - 1 ) {
            if ( (i > 0 ? arr[i - 1] : 0) < (j < n - 1 ? arr[j + 1] : 0) ) {
                j++;
                curr = Math.min(curr, arr[j]);
            } else {
                i--;
                curr = Math.min(curr, arr[i]);
            }
            ans = Math.max(ans, curr * (j - i + 1));
        }
        return ans;
    }

    public int lendyApproach(int[] arr, int k) {
        int ans = solve(arr, k);

        int n = arr.length;
        // do same thing for left side as well.
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = t;
        }

        ans = Math.max( ans, solve( arr, n - 1 - k ) );
        return ans;
    }

    public int solve(int[] arr, int k) {
        // create left prefix min array
        int[] left = new int[k];
        int curr = Integer.MAX_VALUE;
        for (int i = k - 1; i >= 0; i--) {
            curr = Math.min(curr, arr[i]);
            left[i] = curr;
        }


        // create right prefix min array
        List<Integer> right = new ArrayList<>();
        curr = Integer.MAX_VALUE;
        for (int i = k; i < arr.length; i++) {
            curr = Math.min(curr, arr[i]);
            right.add(curr);
        }

        // traverse in right prefix min array
        int ans = 0;
        for (int i = 0; i < right.size(); i++) {
            curr = right.get(i);    // consider each element as current minimum possible value
            // now check max how many elemets from left we can include in this subarray
            // so that mini would still be 'curr'
            int idx = binarySearch(left, curr);

            // so, how many elements do we have now. (including left and right elements)
            int size = (k + i) - idx + 1;

            // find best possible answer
            ans = Math.max( ans, curr * size );
        }

        return ans;
    }

    public int binarySearch(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if ( arr[mid] < target ) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return si;
    }
}