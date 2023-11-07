class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        
        double d [] = new double[dist.length];

        for(int i=0;i<dist.length;i++){
            double time =(double)dist[i] /speed[i];
            d[i]=time;
        }

        Arrays.sort(d);

        int c=0;
        int time=0;
        for(double temp :d){
            if(temp > time){
              c++;
            }
            else{
               break;
            }

            time++;
        }
        return c;
    }
}