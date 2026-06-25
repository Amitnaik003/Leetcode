# Two Sum Optimized Solution

This folder contains an optimized Java solution for the Two Sum problem.

## Problem Statement
Given an array of integers and a target value, find the indices of two numbers that add up to the target.

## Approach
The solution uses a HashMap to store each number along with its index while scanning the array.

For each value:
- Check whether the complement `target - x` already exists in the map.
- If it does, return the stored index and the current index.
- Otherwise, store the current value and index for future use.

## Example
Input:
- Array: `[2, 7, 11, 15]`
- Target: `9`

Output:
- Indices: `0 1`

## Complexity
- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

## How to Run
1. Compile the Java file:
   ```bash
   javac twosumopt.java
   ```
2. Run the program:
   ```bash
   java twosumopt
   ```
