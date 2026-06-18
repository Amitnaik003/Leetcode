# Increasing Triplet Subsequence

This repository contains a Java implementation of the LeetCode problem "Increasing Triplet Subsequence" and demonstrates how to check whether an array contains an increasing subsequence of length 3.

## Problem

Given an integer array `nums`, determine if there exists a triplet of indices `(i, j, k)` with `i < j < k` such that `nums[i] < nums[j] < nums[k]`.

Return `true` if such a triplet exists, otherwise return `false`.

## Solution Overview

The class `tripletexistinarray` implements the method `increasingTriplet(int[] nums)` to solve this problem.

### Steps

1. If the array length is less than 3, return `false` immediately because a triplet is impossible.
2. Construct a prefix minimum array `pre` where `pre[i]` stores the smallest value in `nums[0..i]`.
3. Construct a suffix maximum array `suf` where `suf[i]` stores the largest value in `nums[i..n-1]`.
4. Iterate through the array from index `1` to `nums.length - 2`.
5. For each position `i`, check whether there is a smaller value before it and a larger value after it by testing:
   - `pre[i - 1] < nums[i] < suf[i + 1]`
6. If this condition holds for any index `i`, return `true`.
7. If no such index exists, return `false`.

## Example

Input:
```
[1, 2, 3, 4, 5]
```

Output:
```
true
```

Because `1 < 2 < 3` (or any increasing triplet) exists.

Input:
```
[5, 4, 3, 2, 1]
```

Output:
```
false
```

No increasing triplet can be found.

## Time Complexity

- Building the prefix minimum array takes `O(n)` time.
- Building the suffix maximum array takes `O(n)` time.
- Checking the middle positions takes `O(n)` time.

Overall time complexity: `O(n)`.

## Space Complexity

The implementation uses two extra arrays of size `n`:
- `pre` for prefix minimums
- `suf` for suffix maximums

Overall space complexity: `O(n)`.

## How to Run

1. Compile the Java file:
   ```bash
   javac tripletexistinarray.java
   ```
2. Run the program:
   ```bash
   java tripletexistinarray
   ```
3. Follow the prompts to enter the array size and elements.

## Notes

- The program uses `Scanner` to read input from standard input.
- The method works for all integer arrays, including negative values.
