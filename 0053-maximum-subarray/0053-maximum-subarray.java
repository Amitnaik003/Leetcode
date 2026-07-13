class Solution {
    public int maxSubArray(int[] nums) {
        int psum = 0;
        int submax = Integer.MIN_VALUE;

        for (int i : nums) {
            psum = Math.max(psum + i, i);
            submax = Math.max(submax, psum);
        }

        return submax;
    }
}