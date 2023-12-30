class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        int len = words.length;
        int sumOfWordsLength = 0;
        if(words.length==1){
            return true;
        }
        for(String word : words){
            for(char ch : word.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            sumOfWordsLength +=word.length();
        }
        for(Integer val : map.values()){
            if(val==1){
                return false;
            }
            if(val%len != 0){
                return false;
            }
        }
        
        return true;
    }
}