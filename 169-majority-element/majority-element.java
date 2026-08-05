import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            // Increment the count for the current number
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            // Check if this number is the majority element
            if (count > n / 2) {
                return num;
            }
        }

        return -1;
    }
}