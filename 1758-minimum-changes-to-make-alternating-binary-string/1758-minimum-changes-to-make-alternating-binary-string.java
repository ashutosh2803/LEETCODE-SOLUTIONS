class Solution {
    public int minOperations(String s) {
        int evenone = 0;
        int evenzero = 0;
        int oddone = 0;
        int oddzero = 0;
        for(int i = 0 ; i < s.length();i++){
            if(i%2==0){
                if(s.charAt(i) == '1') evenone++;
                else evenzero++;
            }
            else{
                if(s.charAt(i) == '1') oddone++;
                else oddzero++;
            }
        }
        int x = evenone+oddzero;
        int y = oddone+evenzero;
        if(x<y) return x;
        return y;
    }
}