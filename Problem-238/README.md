# LeetCode Problem 238: Product of Array Except Self

This repository contains a Java solution for LeetCode problem 238: *Product of Array Except Self*.

## Problem
Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The solution must be implemented without using division and in O(n) time.

## Solution File
- `sumofexpicitarray.java`

## How to Run
1. Open a terminal in the project directory.
2. Compile the Java file:
   ```bash
   javac sumofexpicitarray.java
   ```
3. Run the program:
   ```bash
   java sumofexpicitarray
   ```

## Expected Output
For the sample input `[1, 2, 3, 4]`, the output is:

```text
[24, 12, 8, 6]
```

## Notes
- The solution uses prefix and suffix product arrays to compute the result without division.
- It handles the edge case for an input array of length 2.
