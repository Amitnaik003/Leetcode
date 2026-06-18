# Can Place Flowers - LeetCode Problem 605

## Problem Statement

You have a long flowerbed in which some plots are planted, and some are not. However, flowers cannot be planted in **adjacent** plots.

Given an integer array `flowerbed` containing 0's and 1's, where:
- `0` means empty plot
- `1` means planted plot

And given an integer `n`, return `true` if `n` new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

## Algorithm Explanation

The solution uses a **greedy approach**:

1. Iterate through each plot in the flowerbed
2. For each empty plot (0):
   - Check if the left neighbor is empty (or doesn't exist)
   - Check if the right neighbor is empty (or doesn't exist)
3. If both neighbors are empty (or don't exist), plant a flower there:
   - Set the plot to 1
   - Decrement the count of flowers to plant
4. Return `true` if we can plant all `n` flowers

### Key Insights
- A flower can only be planted if the current plot is empty (0) AND both adjacent plots are empty or don't exist
- Once a flower is planted, we mark it immediately to prevent planting adjacent flowers
- This greedy approach works because planting a flower at the earliest valid position never prevents us from planting more flowers later

## Complexity Analysis

- **Time Complexity**: O(n) - Single pass through the flowerbed array
- **Space Complexity**: O(1) - Only using a constant amount of extra space

## Usage

### How to Run

```bash
javac plantflower.java
java plantflower
```

### Example Execution

```
Enter size of flowerbed: 5
Enter flowerbed elements (0 or 1):
1 0 0 0 1
Enter number of flowers to plant: 1
Can place flowers? true
```

### Test Cases

| Flowerbed | n | Output | Reason |
|-----------|---|--------|--------|
| [1,0,0,0,1] | 1 | true | Can plant at index 2 |
| [1,0,0,0,1] | 2 | false | Can only plant 1 flower |
| [0,0,0,0,0] | 2 | true | Can plant at indices 0 and 2 (or 2 and 4) |
| [0] | 1 | true | Single empty plot - can plant |
| [1] | 0 | true | Already has a flower, need to plant 0 |

## Code Structure

- **`canPlaceFlowers(int[] flowerbed, int n)`**: Main method that determines if `n` flowers can be planted
  - Returns `true` if flowers can be planted, `false` otherwise

- **`main(String[] args)`**: Driver method for user interaction
  - Takes input for flowerbed size, elements, and number of flowers
  - Displays the result

## Solution Walkthrough

For flowerbed `[1, 0, 0, 0, 1]` and `n = 1`:

```
Index:    0  1  2  3  4
Initial:  1  0  0  0  1

i = 0: flowerbed[0] = 1 (skip, already planted)
i = 1: flowerbed[1] = 0
  - left = flowerbed[0] = 1 (not empty)
  - Skip

i = 2: flowerbed[2] = 0
  - left = flowerbed[1] = 0 (empty ✓)
  - right = flowerbed[3] = 0 (empty ✓)
  - Plant flower here!
  - flowerbed[2] = 1, n = 0

n == 0, return true
```

## Constraints

- `1 <= flowerbed.length <= 2 * 10^4`
- `flowerbed[i]` is 0 or 1
- `0 <= n <= flowerbed.length`
