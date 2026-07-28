import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        
        // BUG FIX 1: Two-pointer logic demands a sorted array
        Arrays.sort(nums); 
        
        int i = 0;
        // BUG FIX 2: Variable j must be declared/reset INSIDE the first while loop
        while(i < nums.length){ 
            int j = i + 1; 
            while(j < nums.length){
                int k = j + 1;
                int l = nums.length - 1;
                while(k < l){
                    // BUG FIX 3: Cast to long to avoid 32-bit integer overflow
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    
                    if(sum == target){
                        List<Integer> t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add(nums[l]);
                        ans.add(t);
                        
                        // Move pointers forward after a match to avoid infinite loop
                        k = k + 1;
                        l = l - 1;
                    } else if(sum > target){
                        l = l - 1;
                    } else {
                        k = k + 1;
                    }
                }
                j = j + 1;
            }
            i = i + 1;
        }
        return new ArrayList<>(ans);
    }
}
