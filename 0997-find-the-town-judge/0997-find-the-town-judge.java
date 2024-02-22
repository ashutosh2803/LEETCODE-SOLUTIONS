class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, HashSet<Integer>> trustMp = new HashMap<>();
        
        for(int[] tPair : trust){
            int person = tPair[0], trustedPerson = tPair[1];
            
            trustMp.computeIfAbsent(person, k -> new HashSet<>()).add(trustedPerson);
        }
        
        int leftPer = 1, rightPer = n;
        while(leftPer < rightPer){
            
            if(trustMp.getOrDefault(leftPer, new HashSet<>()).contains(rightPer)){
                leftPer++;
            }else rightPer--;
        }
        
        int cand = leftPer, candTrustNumber = 0;
        for(int[] tPair : trust){
            if(tPair[0] == cand){
                candTrustNumber--;
            }else if(tPair[1] == cand){
                candTrustNumber++;
            }
        }
        
        return (candTrustNumber == n-1) ? cand : -1;
    }
}
