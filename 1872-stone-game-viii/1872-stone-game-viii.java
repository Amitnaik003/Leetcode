class Solution {
    public int stoneGameVIII(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++)
            A[i] = A[i] +  A[i - 1];

        int dp = A[n - 1];
        for (int i = n - 2; i > 0; i--)
            dp = Math.max(dp, A[i] - dp);

        return dp;
    }
}