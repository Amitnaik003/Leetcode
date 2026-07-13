import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // base case: sum 0 at index -1

        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Convert 0 -> -1
            sum += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(sum)) {
                // Same sum seen before -> equal 0s and 1s in between
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                // First time this sum seen
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
