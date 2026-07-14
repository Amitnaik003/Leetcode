class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += mat[i][i];
            // secondary diagonal (avoid double count at center)
            if (i != n - i - 1) {
                sum += mat[i][n - i - 1];
            }
        }
        return sum;
    }
}
