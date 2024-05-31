# 121. Maximum Profit from Stock Prices

## Problem Statement

You are given an array `prices` where `prices[i]` is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

### Example 1
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

## Approach

To solve this problem efficiently, we can use a single-pass algorithm. The idea is to keep track of the minimum price encountered so far while iterating through the list of prices and calculating the potential profit for each day. Here's a step-by-step explanation of how to do this:

1. **Initialize Variables**:
   - `minPrice`: Track the minimum price encountered so far. Initialize it to a very large value (`Integer.MAX_VALUE`).
   - `maxProfit`: Track the maximum profit encountered so far. Initialize it to 0.

2. **Iterate Through Prices**:
   - For each price in the array, update `minPrice` if the current price is lower.
   - Calculate the potential profit for the current price by subtracting `minPrice` from the current price.
   - Update `maxProfit` if the potential profit is greater than the current `maxProfit`.

3. **Return `maxProfit`**:
   - After iterating through all prices, return the `maxProfit`.

### Time and Space Complexity

- **Time Complexity**: O(n)
  - The algorithm makes a single pass through the `prices` array, where `n` is the number of days. Each element is processed once, resulting in linear time complexity.
  
- **Space Complexity**: O(1)
  - The algorithm uses a constant amount of extra space (`minPrice` and `maxProfit`), regardless of the input size. Therefore, the space complexity is constant.
