class Solution {
    public int numDecodings(String s) {
        int[] way = new int[s.length()];
        Arrays.fill(way, -1);
        return numDecodings(s, 0, 0, way);
    }
    int numDecodings(String s, int index, int forward, int[] way){
        if(index>s.length()) return 0;
        if(forward == 1 ){
            if(s.charAt(index-1)=='0') return 0;
        } else {
            if(index>=2){
                int item = Integer.parseInt(s.substring(index-2, index));
                if(s.charAt(index-2)=='0' || item>26) return 0;
            }
        }
        if(s.length() == index) return 1;
        if(way[index]!= -1) return way[index];
        return way[index] = numDecodings(s, index+1, 1, way)+numDecodings(s, index+2, 2, way);
    }
}