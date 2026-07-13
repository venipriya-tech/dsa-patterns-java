/*
Problem: Two Sum
Pattern: Hash Map

Approach:
Use a HashMap to store previously seen numbers and their indices.
For each element, check if the complement exists in the map.

Time Complexity: O(n)
Space Complexity: O(n)
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
