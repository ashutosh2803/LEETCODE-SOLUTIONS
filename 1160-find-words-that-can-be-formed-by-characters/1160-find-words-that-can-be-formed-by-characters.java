class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(containsIgnoreCase(chars, words[i])){
                count += words[i].length();
            }
        }
        return count;
    }
     private static boolean containsIgnoreCase(String chars, String word) {
        int[] charCount = new int[26]; 
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : word.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--;
        }
        return true;
    }
}