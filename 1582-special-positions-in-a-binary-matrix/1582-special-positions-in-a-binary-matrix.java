class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && isUniqueInRow(mat, i) && isUniqueInCol(mat, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isUniqueInRow(int[][] mat, int row) {
        int count = 0;
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[row][j] == 1) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return count == 1;
    }

    private boolean isUniqueInCol(int[][] mat, int col) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] == 1) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return count == 1;
    }
}
