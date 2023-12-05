class Solution {
    public int numberOfMatches(int n) {
        ArrayList<Integer> rounds = new ArrayList<Integer>();
        while(n != 1){
            if(n % 2 == 0){
             int result = n / 2;
             rounds.add(result);
            }else{
                int result = n / 2 + 1;
                rounds.add(result);
            }
            n = n / 2;
        }
        int result = 0;
        for(int e : rounds){
            result += e;
        }
        return result;
    }
}