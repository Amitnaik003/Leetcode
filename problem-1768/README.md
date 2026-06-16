# LeetCode Problem 1768 - Merge Strings Alternately

## Problem Description

Given two strings `word1` and `word2`, merge the strings by adding letters in alternating order, starting with `word1`. If a string is longer than the other, append the additional letters onto the end of the merged string.

**Example:**
- Input: `word1 = "abc"`, `word2 = "pqr"`
- Output: `"apbqcr"`

Explanation: The merged string will be formed as: "a" + "p" + "b" + "q" + "c" + "r" = "apbqcr"

## Solution Code

```java
class MergeStringalter1768 {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        
        // Add characters alternately from both strings
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        
        // Append remaining characters from word1 (if any)
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }
        
        // Append remaining characters from word2 (if any)
        while (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        MergeStringalter1768 obj = new MergeStringalter1768();
        String word1 = "abc";
        String word2 = "pqr";
        String result = obj.mergeAlternately(word1, word2);
        System.out.println(result);  // Output: apbqcr
    }
}
```

## Algorithm Explanation

### Approach: Two-Pointer Technique

1. **Initialize two pointers** `i` and `j` to track positions in `word1` and `word2` respectively
2. **First loop**: Iterate while both strings have characters remaining. Alternately append characters from `word1` and `word2`
3. **Second loop**: If `word1` has remaining characters, append them all to the result
4. **Third loop**: If `word2` has remaining characters, append them all to the result
5. **Return**: Convert `StringBuilder` to `String` and return the result

### Example Walkthrough

For `word1 = "abc"` and `word2 = "pqr"`:

| Step | i | j | Action | Result |
|------|---|---|--------|--------|
| 1 | 0 | 0 | Append 'a' from word1 | "a" |
| 2 | 0 | 0 | Append 'p' from word2 | "ap" |
| 3 | 1 | 1 | Append 'b' from word1 | "apb" |
| 4 | 1 | 1 | Append 'q' from word2 | "apbq" |
| 5 | 2 | 2 | Append 'c' from word1 | "apbqc" |
| 6 | 2 | 2 | Append 'r' from word2 | "apbqcr" |
| 7 | 3 | 3 | Both strings exhausted | "apbqcr" |

## Complexity Analysis

### Time Complexity: **O(m + n)**
- `m` = length of `word1`
- `n` = length of `word2`
- The first loop runs `min(m, n)` times
- The second loop runs `max(0, m - n)` times
- The third loop runs `max(0, n - m)` times
- Total operations: `min(m, n) + |m - n| = m + n`
- Each character is visited exactly once, resulting in linear time complexity

### Space Complexity: **O(m + n)**
- The `StringBuilder` stores the merged string which has length `m + n`
- The space used by the `StringBuilder` is proportional to the total length of both input strings
- Not counting the output string, the algorithm uses O(1) extra space (only two pointers)

## Test Cases

```java
// Test Case 1: Equal length strings
word1 = "abc", word2 = "pqr"
Output: "apbqcr"

// Test Case 2: word1 is longer
word1 = "ab", word2 = "pqrs"
Output: "apbqrs"

// Test Case 3: word2 is longer
word1 = "abcd", word2 = "pq"
Output: "apbqcd"

// Test Case 4: Empty string
word1 = "", word2 = "pqr"
Output: "pqr"

// Test Case 5: Single character
word1 = "a", word2 = "b"
Output: "ab"
```

## Key Points

- **StringBuilder** is used instead of String concatenation for better performance (avoids creating intermediate strings)
- **Two-pointer approach** ensures we process each character exactly once
- The algorithm handles strings of different lengths naturally
- No additional data structures are needed beyond the pointers and result builder
