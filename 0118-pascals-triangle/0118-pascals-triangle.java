class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> r = new ArrayList();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else {
                    int prev1 = r.get(i - 1).get(j - 1);
                    int prev2 = r.get(i - 1).get(j);
                    row.add(prev1 + prev2);
                }
            }
            r.add(row);
        }
        return r;
    }
}