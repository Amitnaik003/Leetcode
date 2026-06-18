# LeetCode Problem 217: Contains Duplicate

## Problem Statement
Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

## Example
```
Input: nums = [1,3,4,2,2]
Output: true

Input: nums = [1,2,3,4]
Output: false
```

## Solution Approach
The solution uses a **HashSet** to track elements we've already encountered:
1. Iterate through each element in the array
2. Check if the element already exists in the HashSet
   - If it does, we found a duplicate → return `true`
   - If it doesn't, add it to the HashSet
3. If we finish the loop without finding duplicates → return `false`

## Time Complexity
**O(n)** - Linear Time

### Explanation:
- We iterate through the array exactly once, where `n` is the length of the array
- Each operation inside the loop (checking `contains()` and adding `add()`) is **O(1)** for HashSet on average
- Total: **1 iteration × n elements × O(1) operations = O(n)**
- **Best case:** O(1) - if the first two elements are duplicates
- **Worst case:** O(n) - if all elements are unique or duplicates are at the end

## Space Complexity
**O(min(n, m))** - Linear Space

### Explanation:
- We store elements in a HashSet as we iterate
- **In worst case:** We might store all unique elements → **O(n)** space
  - Where `n` is the length of the array
- **In best case:** If duplicates are found early, we store fewer elements → **O(1)** space
- **Practical case:** If the array size is large but we find duplicates quickly, space usage is less than the array size
- We use **O(min(n, m))** where:
  - `n` = array length
  - `m` = number of unique elements
- Since `m ≤ n`, the space is bounded by the array size

## Code
```java
public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> h = new HashSet<>();
    for(Integer i : nums) {
        if (h.contains(i)) return true;
        else h.add(i);
    }
    return false;
}
```

## Trade-offs
| Approach | Time | Space | Notes |
|----------|------|-------|-------|
| HashSet (Current) | O(n) | O(n) | Fast lookup, good for most cases |
| Sorting | O(n log n) | O(1) or O(n) | Slower but less memory if in-place |
| Nested Loop | O(n²) | O(1) | Brute force, very slow |

## When to Use This Solution
✅ When time complexity is more critical than space  
✅ When you need the fastest solution  
✅ When array size is moderate  

❌ When space is extremely limited (use sorting approach instead)
