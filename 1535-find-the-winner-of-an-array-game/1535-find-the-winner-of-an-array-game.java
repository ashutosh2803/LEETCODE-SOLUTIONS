class Solution {
    public int getWinner(int[] arr, int k) {
        // declare max to store maximum value of array
        int max = 0;
        // declare win to store winstreak
        int win = 0;
        // declare queue to simulate game
        Queue<Integer> que = new LinkedList();
        // iterate over array
        for(int i = 0; i < arr.length; i++) {
            // set max value on each iteration
            max = Math.max(max, arr[i]);
            // add each element to queue
            que.add(arr[i]);
        }
        // check if k more or equals to array length, if true return max value
        if(k >= arr.length) return max;
        // get first element from queue
        int a = que.remove();
        // start simulation:
        while(que.size() > 0) {
            // get second element from queue
            int b = que.remove();
            // if a more than b
            if(a > b) {
                // add b to queue
                que.add(b);
                // increase winstreak
                win++;
            // else
            } else {
                // add a to queue
                que.add(a);
                // set a equals to b
                a = b;
                // drop winstreak
                win = 1;
            }
            // if win equals k or a equals max return a
            if(win == k || a == max) return a;
        }
        // return max value
        return max;
    }
}