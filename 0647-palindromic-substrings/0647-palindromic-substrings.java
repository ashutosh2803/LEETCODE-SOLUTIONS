class Solution {
    public int countSubstrings(String s) {
        int totalCount = 0;
        for (int i = 0; i < s.length(); i++) {
            // Count palindromes with odd length
            totalCount += extendPalindrome(s, i, i);
            // Count palindromes with even length
            totalCount += extendPalindrome(s, i, i + 1);
        }
        return totalCount;
    }

    private int extendPalindrome(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}