import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // 1. Sort the array so two-pointer logic works
        Arrays.sort(nums);
        int n = nums.length;
        
        // Loop for the first element
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // Loop for the second element
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate values for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                // Two pointers for the remaining two elements
                int k = j + 1;
                int l = n - 1;
                
                while (k < l) {
                    // Use long to prevent integer overflow
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        
                        // Skip duplicates for the third element
                        while (k < l && nums[k] == nums[k + 1]) k++;
                        // Skip duplicates for the fourth element
                        while (k < l && nums[l] == nums[l - 1]) l--;
                        
                        k++;
                        l--;
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}
