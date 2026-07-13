/*
=========================================================
Problem: Best Time to Buy and Sell Stock
Pattern: Arrays / Greedy
Difficulty: Easy

Problem Statement:
You are given an array prices where prices[i] is the price
of a stock on the ith day.

Choose a single day to buy one stock and a different future
day to sell it.

Return the maximum profit you can achieve. If no profit is
possible, return 0.

Example 1:
Input:
prices = [7,1,5,3,6,4]

Output:
5

Explanation:
Buy on day 2 (price = 1) and sell on day 5 (price = 6).
Profit = 6 - 1 = 5.

Example 2:
Input:
prices = [7,6,4,3,1]

Output:
0

Explanation:
The price keeps decreasing, so no profit can be made.

Approach:
1. Initialize minPrice with the first day's price.
2. Traverse the array from left to right.
3. Update minPrice whenever a lower price is found.
4. Calculate the profit by selling on the current day.
5. Update maxProfit if the current profit is greater.

Time Complexity:
O(n)

Space Complexity:
O(1)

Key Concepts:
- Arrays
- Greedy Algorithm
- Single Pass Traversal

=========================================================
*/
public static int maxProfit(int[] nums) {
    int minPrice = nums[0];
    int maxProfit = 0;

    for (int i = 1; i < nums.length; i++) {

        if (nums[i] < minPrice) {
            minPrice = nums[i];
        }

        int profit = nums[i] - minPrice;

        if (profit > maxProfit) {
            maxProfit = profit;
        }
    }

    return maxProfit;
}
