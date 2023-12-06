class Solution {
    public int totalMoney(int n) {
        int sum =0;
        
        for(int i=1; i<=n/7; i++){
            sum += (7*(2*i+6))/2;
        }
        for(int i=1; i<=n%7; i++){
            sum += i+n/7;
        }
        
        return sum;
    }
}