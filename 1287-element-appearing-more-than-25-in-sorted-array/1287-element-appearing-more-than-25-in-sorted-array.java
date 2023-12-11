class Solution {

    public int findSpecialInteger(int[] arr) {
        
        int condition = (arr.length / 4) + 1;
        int slow = 0;
        int fast = 1;

        if (arr.length == 1) return arr[0];

        while (slow != fast) {
            if (arr[slow] == arr[fast]) {
                fast++;
                if (fast - slow >= condition) return arr[slow];
            } else {
                slow++;
                fast = slow + 1;
            }
        }

        return arr[0];
    }     
}