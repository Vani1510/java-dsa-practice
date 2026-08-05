import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        // 1. Sort to bring closer numbers together
        Arrays.sort(nums);
        
        int left = 0;
        long currentSum = 0;
        int maxFrequency = 0;
        
        // 2. Expand the sliding window
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            
            // 3. Shrink window if operations needed exceed k
            // Needed operations = (target * window_length) - current_sum
            while ((long) nums[right] * (right - left + 1) - currentSum > k) {
                currentSum -= nums[left];
                left++;
            }
            
            // 4. Update the maximum frequency found
            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }
        
        return maxFrequency;
    }
}
