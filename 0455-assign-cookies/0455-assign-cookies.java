class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);

        int idx = 0;
        int cIdx = 0;

        while(cIdx < s.length && idx < g.length) {
            if(s[cIdx] >= g[idx]) {
                idx++;
            }
            cIdx++;
        }
        return idx;
    }
}