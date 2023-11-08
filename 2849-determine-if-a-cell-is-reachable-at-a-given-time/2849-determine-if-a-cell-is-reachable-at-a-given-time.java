class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(fx==sx && fy==sy){
            if(t!=1){
                return true;
            }
            return false;
        }
        int xDiff = Math.abs(fx-sx);
        int yDiff = Math.abs(fy-sy);
        int extra = Math.abs(xDiff-yDiff);        
        return t-extra-Math.min(xDiff,yDiff)>=0;
        
    }
}