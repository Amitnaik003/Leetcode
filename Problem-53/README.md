# LeetCode Problem 53: Maximum Subarray

## Problem Statement
Find the contiguous subarray within an array which has the largest sum.

**Example:**
- Input: `[10, 20, 30, -30, 40, -100, 30, 60, 60]`
- Output: `150` (subarray: `[10, 20, 30, -30, 40]` or `[30, 60, 60]` depending on selection)

## Approach: Kadane's Algorithm

This solution uses **Kadane's Algorithm**, a dynamic programming approach that efficiently finds the maximum sum subarray in O(n) time.

### How It Works:
1. **`psum`** (prefix sum): Tracks the maximum sum ending at the current position
2. **`submax`** (subarray maximum): Tracks the overall maximum sum found so far

At each element, we decide:
- Either extend the existing subarray by adding the current element
- Or start a new subarray from the current element (whichever is larger)

**Key Formula:**
```
psum = max(psum + current, current)
submax = max(submax, psum)
```

## Algorithm Walkthrough

Given array: `[10, 20, 30, -30, 40, -100, 30, 60, 60]`

| i | a[i] | psum | submax |
|---|------|------|--------|
| - | - | 0 | 10 |
| 0 | 10 | 10 | 10 |
| 1 | 20 | 30 | 30 |
| 2 | 30 | 60 | 60 |
| 3 | -30 | 30 | 60 |
| 4 | 40 | 70 | 70 |
| 5 | -100 | -30 | 70 |
| 6 | 30 | 30 | 70 |
| 7 | 60 | 90 | 90 |
| 8 | 60 | 150 | **150** |

## Complexity Analysis

- **Time Complexity:** O(n) - Single pass through the array
- **Space Complexity:** O(1) - Only uses constant extra space

## How to Run

1. Compile the Java file:
   ```bash
   javac maxsubarray.java
   ```

2. Run the program:
   ```bash
   java maxsubarray
   ```

3. Expected Output:
   ```
   [10, 20, 30, -30, 40, -100, 30, 60, 60]
   Max Subarray is: 150
   ```

## Code Explanation

```java
int a[] = {10,20,30,-30,40,-100,30,60,60};
int psum = 0;              // Current subarray sum
int submax = a[0];         // Initialize with first element
```

```java
for(int i:a){
    psum = Math.max(psum+i, i);  // Extend or start fresh
    submax = Math.max(submax, psum); // Update global maximum
}
```

## Edge Cases

- **All negative numbers:** Returns the largest negative number
- **Single element:** Returns that element
- **Empty subarrays not allowed:** At least one element must be in the subarray

## Related Problems

- LeetCode 152: Maximum Product Subarray
- LeetCode 918: Maximum Sum Circular Subarray
- LeetCode 1749: Maximum Absolute Sum of Any Subarray

## References

- [Kadane's Algorithm - Wikipedia](https://en.wikipedia.org/wiki/Maximum_subarray_problem)
- [LeetCode Problem 53](https://leetcode.com/problems/maximum-subarray/)
