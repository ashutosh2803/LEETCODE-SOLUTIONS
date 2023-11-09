class Solution {
    public int countHomogenous(String s) {


        /*
        Step 1: if we found a new character which is not matching with the previous character then we start countint the number of substring from 1.
        Step 2: if previous and current character matches then number of substring equal to sum of n natural number where n is 
        length of substring.. 

        beacuse of that we are adding the length value to the result if Step 2 satisfy.

        for "a" -> we add 1
        for "aa" -> length value will be 2, hence we add 2
        for "aaa" -> length value will be 3 , hence we add 3.
        

        // current charcter is b
        for "aaab" -> for current character b , as b not matched with a, hence we start again from 1 and adding it to the result.
        
        
        */
       

       long length = 0;
       long res = 0;
       int mod = (int) 1e9 + 7;

       for(int i = 0 ; i < s.length(); i++){
           if(i > 0 && s.charAt(i) == s.charAt(i-1)){
               length += 1;
           }
           else{
               length = 1;
           }
           res += (length % mod);
       }

       return (int)(res % mod);
    }
}