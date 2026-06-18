# Find Duplicates in Array - Solution

## Problem Statement
Find all duplicate numbers in an array where the array contains n+1 integers and each integer is between 1 and n.

## Solution Explanation

The solution uses two ArrayLists to track:
- **seen**: Stores numbers we've already encountered
- **dup**: Stores the duplicate numbers found

### Algorithm
1. Iterate through each number in the array
2. Check if the number already exists in the `seen` list
3. If yes, add it to the `dup` (duplicates) list
4. If no, add it to the `seen` list
5. Return the list of duplicates

### Example
Input: `[1, 3, 4, 2, 2]`
- Iteration 1: 1 not in seen → add 1 to seen → seen: [1]
- Iteration 2: 3 not in seen → add 3 to seen → seen: [1, 3]
- Iteration 3: 4 not in seen → add 4 to seen → seen: [1, 3, 4]
- Iteration 4: 2 not in seen → add 2 to seen → seen: [1, 3, 4, 2]
- Iteration 5: 2 in seen → add 2 to dup → dup: [2]

Output: `[2]`

---

## Complexity Analysis

### Time Complexity: **O(n²)**

**Explanation:**
- The outer loop iterates through all n elements: O(n)
- Inside the loop, `seen.contains(i)` is called for each element
- `contains()` on ArrayList requires linear search through all elements: O(n)
- In the worst case, we search through the entire `seen` list for each element
- **Total:** O(n) × O(n) = **O(n²)**

**Worst Case Scenario:** All unique elements followed by duplicates would cause maximum searches in the `seen` list.

### Space Complexity: **O(n)**

**Explanation:**
- `seen` ArrayList can store up to n unique elements in the worst case
- `dup` ArrayList stores the duplicate numbers (at most n elements, but typically much fewer)
- The maximum space used is O(n) for the `seen` list
- **Total:** **O(n)**

### Breakdown:
| Component | Space Used |
|-----------|-----------|
| `seen` ArrayList | O(n) |
| `dup` ArrayList | O(k) where k = number of duplicates ≤ n |
| Other variables | O(1) |
| **Total** | **O(n)** |

---

## Trade-offs

### Current Solution
✅ **Pros:**
- Simple and easy to understand
- Works correctly for finding duplicates
- Uses minimal extra variables

❌ **Cons:**
- O(n²) time complexity is inefficient for large arrays
- ArrayList `contains()` operation is slow

### Optimized Alternative (Using HashSet)
```java
public List<Integer> findDuplicates(int[] nums) {
    HashSet<Integer> seen = new HashSet<>();
    List<Integer> dup = new ArrayList<>();
    for(int i : nums) {
        if(!seen.add(i)) {
            dup.add(i);
        }
    }
    return dup;
}
```
- **Time Complexity:** O(n) - HashSet `add()` is O(1) on average
- **Space Complexity:** O(n) - same space usage
- **Better for:** Large arrays where performance matters

---

## Key Takeaway
For this problem, using a **HashSet** instead of ArrayList would significantly improve the time complexity from **O(n²) to O(n)** while maintaining the same space complexity of **O(n)**.
