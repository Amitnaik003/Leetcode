    import java.util.Arrays;

    public class Solution {
        public int arrayPairSum(int[] nums) {
            // Step 1: Sort the array
            Arrays.sort(nums);

            int sum = 0;

            // Step 2: Add every alternate element (starting from index 0)
            for (int i = 0; i < nums.length; i += 2) {
                sum += nums[i];
            }

            // Step 3: Return the result
            return sum;
        }

        // Optional main method for testing
        public static void main(String[] args) {
            Solution sol = new Solution();
            int[] nums1 = {1, 4, 3, 2};
            int[] nums2 = {6, 2, 6, 5, 1, 2};

            System.out.println(sol.arrayPairSum(nums1)); // Output: 4
            System.out.println(sol.arrayPairSum(nums2)); // Output: 9
        }
    }
