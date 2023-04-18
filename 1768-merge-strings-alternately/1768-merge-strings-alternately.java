class Solution {
    public String mergeAlternately(String w1, String w2) {
        int size1 = w1.length();
        int size2 = w2.length();
        
        int i = 0;
        int j = 0;
        
        StringBuilder result = new StringBuilder();
        
        while (i < size1 || j < size2) {
            
            if (i < w1.length())
                result.append(w1.charAt(i++));
            
            if (j < w2.length())
                result.append(w2.charAt(j++));
        }
        
        return result.toString();
    }
}