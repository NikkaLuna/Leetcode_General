# 53. Maximum Subarray Problem

## Problem Description

Given an integer array `nums`, find the subarray with the largest sum, and return its sum.

### Example 1:
- **Input**: `nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`
- **Output**: `6`
- **Explanation**: The subarray `[4, -1, 2, 1]` has the largest sum of `6`.

### Example 2:
- **Input**: `nums = [1]`
- **Output**: `1`
- **Explanation**: The subarray `[1]` has the largest sum of `1`.

## Approach

To solve this problem, we can use **Kadane's Algorithm**. This algorithm efficiently finds the maximum sum of a contiguous subarray in linear time. Here’s a step-by-step explanation of the approach:

1. **Initialization**:
   - Initialize two variables: `max_so_far` and `max_ending_here` to the first element of the array. These will keep track of the maximum sum found so far and the maximum sum ending at the current position, respectively.

2. **Iterate Through the Array**:
   - Starting from the second element, iterate through the array.
   - For each element, update `max_ending_here` to be the maximum of the current element itself or the current element plus `max_ending_here`. This step decides whether to start a new subarray at the current element or continue the existing subarray.
   - Update `max_so_far` to be the maximum of `max_so_far` and `max_ending_here`. This keeps track of the highest sum encountered.

3. **Return Result**:
   - After iterating through all elements, `max_so_far` will contain the sum of the subarray with the largest sum.

## Space and Time Complexity

### Time Complexity
- **O(n)**: The algorithm makes a single pass through the array (`n` elements), processing each element once. This results in a linear time complexity.

### Space Complexity
- **O(1)**: The algorithm uses a constant amount of extra space. Only a few integer variables are used (`max_so_far` and `max_ending_here`), regardless of the input size.

This approach ensures an efficient solution to the maximum subarray problem with optimal space and time complexity.
