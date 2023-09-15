class Solution {
    public int minCostConnectPoints(int[][] points) {
        int[] distances = new int[points.length];
        boolean[] wasSearched = new boolean[points.length];
        Arrays.fill(distances, Integer.MAX_VALUE);

        // Start Prims Algorithm at node with index = 0
        Integer nextNode = 0;
        while(nextNode != null){
            wasSearched[nextNode] = true;
            int minDistance = Integer.MAX_VALUE;
            int currentNode = nextNode;
            nextNode = null;
            for(int j = 0; j < points.length; j++){
                if(wasSearched[j]) continue;
                int newDistance = getDistance(points[currentNode], points[j]);
                if(newDistance < distances[j]){
                    // Update distance of node j if the currentNode has a new shorter distance to node j. 
                    distances[j] = newDistance;
                }
                if(distances[j] < minDistance){
                    // The next node must be the node with the shortest distance of any unsearched node.
                    minDistance = distances[j];
                    nextNode = j;
                }
            }

        }
        return sumArray(distances);


    }

    private int sumArray(int[] distances){
        int sum = 0;
        for(int i = 1; i < distances.length; i++){
            sum += distances[i];
        }
        return sum;
    }

    private int getDistance(int[] u, int[] v){
        int x = u[0] -  v[0] > 0 ? u[0] -  v[0] : v[0] - u[0];
        int y = u[1] -  v[1] > 0 ? u[1] -  v[1] : v[1] - u[1];
        return x + y;
    }
}