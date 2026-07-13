public class Solution {
    public int removeElement(int[] nums, int val) {
        // Initialize a pointer for tracking the position of elements not equal to val
        int j = 0;

        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, copy it to the jth position
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++; // Increment the position for the next non-val element
            }
        }

        // Return the number of elements that are not equal to val
        return j;
    }
}
