/*
=========================================================
Problem: Contains Duplicate
Pattern: Hash Set
Difficulty: Easy

Problem Statement:
Given an integer array nums, return true if any value
appears at least twice in the array, and return false
if every element is distinct.

Example 1:
Input:
nums = [1,2,3,1]

Output:
true

Example 2:
Input:
nums = [1,2,3,4]

Output:
false

Example 3:
Input:
nums = [1,1,1,3,3,4,3,2,4,2]

Output:
true

Approach:
1. Create an empty HashSet.
2. Traverse the array once.
3. Check whether the current element already exists in the HashSet.
4. If it exists, return true.
5. Otherwise, add the current element to the HashSet.
6. If the loop completes, return false.

Time Complexity:
O(n)

Explanation:
- We traverse the array only once.
- HashSet lookup (contains) takes O(1) on average.
- HashSet insertion (add) also takes O(1) on average.
- Therefore, the total time complexity is O(n).

Space Complexity:
O(n)

Explanation:
- In the worst case, all elements are unique.
- The HashSet stores all n elements.
- Therefore, the extra space required is O(n).

Key Concepts:
- HashSet
- One-pass traversal
- Fast lookup

=========================================================
                Contains Duplicate
                        │
          ┌─────────────┴─────────────┐
          │                           │
      Pattern                    HashSet
          │                           │
   Check duplicates          Store unique values
          │
          ▼
For each element
          │
          ▼
Already in HashSet?
          │
     ┌────┴────┐
     │         │
   Yes        No
     │         │
Return true   Add to HashSet
               │
               ▼
           Continue

Key Memory Trick

Need to check duplicates?
Think "Seen Before? → HashSet".

=========================================================
*/

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
