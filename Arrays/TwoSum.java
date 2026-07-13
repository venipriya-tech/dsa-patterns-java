/*
=========================================================
Problem: Two Sum
Pattern: Hash Map
Difficulty: Easy

Problem Statement:
Given an array of integers nums and an integer target,
return the indices of the two numbers such that they add
up to the target.
You may assume that each input has exactly one solution, and you may not use the same element twice.

Example:
Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]

Approach:
1. Traverse the array once.
2. Calculate the complement = target - nums[i].
3. Check if the complement already exists in the HashMap.
4. If found, return the indices.
5. Otherwise, store the current element and its index.

Time Complexity:
O(n)

Space Complexity:
O(n)

Key Concepts:
- HashMap
- One-pass traversal

=========================================================
                    Two Sum
                       │
        ┌──────────────┴──────────────┐
        │                             │
    Pattern                      HashMap
        │                             │
 Find two numbers             number → index
 whose sum = target
        │
        ▼
For each element
        │
        ▼
complement = target - nums[i]
        │
        ├── Complement exists?
        │       │
        │       ├── Yes → Return indices
        │       │
        │       └── No → Store current number
        │
        ▼
Continue

Key Memory Trick

Need to find a pair? Think "Complement + HashMap".
*/

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
