class Solution {
    public int numberOfWays(String corridor) {
        int len = corridor.length();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (corridor.charAt(i) == 'S') {
                list.add(i);
            }
        }
        
        if (list.isEmpty() || list.size() % 2 != 0) return 0;
        
        long ans = 1;
        for (int i = 1; i < list.size(); i+=2) {
            if (i+1 < list.size()) {
                int diff = list.get(i+1) - list.get(i);
                ans *= diff;
                ans %= 1_000_000_007;
            }
        }
        return (int) ans;
    }
}