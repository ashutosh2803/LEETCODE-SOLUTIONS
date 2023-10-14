class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int[][] memo = new int[cost.length + 1][time.length + 1];
       
        for(int[] arr: memo){
            Arrays.fill(arr, -1);
        }

        int walls = time.length; // can be cost.length too

        return helper(cost, time, 0, walls, memo);
    }

    public int helper(int[] cost, int[] time, int ind, int remains, int[][] memo){

        // That means we have painted all walls 
        if(remains <= 0){
            return 0;
        }

        if(ind >= time.length) {
            return (int)1e9;
        }       

        if(memo[ind][remains] != -1){
            return memo[ind][remains];
        }

        int take = cost[ind] + 
                   helper(cost, time, ind + 1, remains - 1 - time[ind], memo);
        int notTake = helper(cost, time, ind + 1, remains, memo);

        memo[ind][remains] = Math.min(take, notTake);

        return memo[ind][remains];  

    }
}

//remains - 1 - time[ind] :

//If I am picking up the painter, then my 1 wall will get painted
//plus the time[ind] of walls (that will be painted by free painters
//So this expression tells the totals walls are getting painted
