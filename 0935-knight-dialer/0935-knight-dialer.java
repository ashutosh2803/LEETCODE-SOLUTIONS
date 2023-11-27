class Solution {
    public int knightDialer(int n) {
        int[][] routes = 
        {{4,6},//0  if at key 0, can go to key 4 and key 6
        {6,8},
        {7,9},//2
        {4,8},
        {0,3,9},
        {},
        {0,1,7},//6
        {2,6},
        {1,3},
        {2,4}//9
        };

        int mod = 1000000007;

        long[] sum = new long[10];
        Arrays.fill(sum, 1);// for n==1, can only place at all 10 keys
        for(int i=1; i<n; i++){
            long[] temp = new long[10];
            for(int j=0; j<10; j++){
                for(int val:routes[j])
                    temp[j] += sum[val];
                temp[j] %= mod;
            }
            sum = temp;
        }
        long tot = 0;
        for(long val:sum)
            tot += val;
        return (int)(tot%mod);
    }
}