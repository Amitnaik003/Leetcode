class Solution {
    public int minPatches(int[] nums, int n) {
        long miss = 1;   // the smallest number we cannot form yet
        int patches = 0; // count of patches we add
        int i = 0;       // pointer for nums array

        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                // if nums[i] is within reach, use it to extend coverage
                miss += nums[i];
                i++;
            } else {
                // nums[i] is too big, so we must patch with 'miss'
                miss += miss; // effectively doubles the range
                patches++;
            }
        }
        return patches;
    }
}
