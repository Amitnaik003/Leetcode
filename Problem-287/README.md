# LeetCode Problem 287 - Find the Duplicate Number

## Problem Statement
Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive, find the duplicate number. There is only one duplicate number but it may appear more than once.

### Example
```
Input: nums = [1,3,4,2,2]
Output: 2

Input: nums = [3,1,3,4,2]
Output: 3
```

---

## Solution: HashMap Approach

### Algorithm
The solution uses a **HashMap** to track numbers we've already seen:

1. Iterate through the array
2. For each number, check if it exists in the HashMap
3. If it exists, we've found the duplicate - return it
4. If it doesn't exist, add it to the HashMap with value 0
5. If we finish the loop without finding a duplicate, return 0

### Code
```java
public int findDuplicate(int[] nums) {
    HashMap<Integer,Integer> h = new HashMap<>();
    for(Integer i : nums) {
        if(h.containsKey(i)) 
            return i;  // Duplicate found
        else 
            h.put(i, 0);  // Store the number
    }
    return 0;
}
```

---

## Complexity Analysis

### Time Complexity: **O(n)**

**Explanation:**
- The algorithm iterates through the array exactly once
- Each iteration performs constant-time operations: `HashMap.containsKey()` and `HashMap.put()`
- Both HashMap operations run in **O(1)** average time due to hash table lookup
- Total iterations: `n` (length of array)
- **Overall: O(n)**

### Space Complexity: **O(n)**

**Explanation:**
- The HashMap stores elements from the input array
- In the **worst case**, if the duplicate appears at the very end, we'll store `n-1` unique elements
- HashMap space grows linearly with the number of distinct elements stored
- **Overall: O(n)** additional space required

**Space Breakdown:**
- Best case: O(1) - if the duplicate is the second element
- Average case: O(n/2) - approximately half the array stored
- Worst case: O(n) - if duplicate is at the end

---

## Advantages & Disadvantages

### Advantages ✅
- Simple and easy to understand
- Guaranteed O(n) time complexity
- Returns immediately upon finding duplicate

### Disadvantages ❌
- Uses O(n) extra space (HashMap)
- Not space-optimized

---

## Alternative Approaches

### 1. **Floyd's Cycle Detection (Optimal)**
- Time: O(n)
- Space: O(1) - constant space ✅
- Treats array as linked list where `nums[i]` points to index `nums[i]`

### 2. **Binary Search**
- Time: O(n log n)
- Space: O(1)

### 3. **Sorting (Destructive)**
- Time: O(n log n)
- Space: O(1) if sorting in-place
- Warning: Modifies input array

---

## How to Run

### Compile & Run
```bash
javac findduplicatehash.java
java findduplicatehash
```

### Output
```
2
```

---

## Test Cases

| Input | Expected Output | Status |
|-------|-----------------|--------|
| [1,3,4,2,2] | 2 | ✅ |
| [3,1,3,4,2] | 3 | ✅ |
| [1,1] | 1 | ✅ |
| [2,5,9,6,4,8,7,7,1,3] | 7 | ✅ |

---

## Recommendations
For production code or interviews, consider using **Floyd's Cycle Detection** algorithm which achieves O(n) time with **O(1) space** complexity!
