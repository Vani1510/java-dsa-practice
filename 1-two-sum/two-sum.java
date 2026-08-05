import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the required number was already seen
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Store current number and its index in the map
            map.put(nums[i], i);
        }
        
        return new int[] {}; // Fallback (won't be reached as per problem constraints)
    }
}