import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int prod1 = nums[n-1] * nums[n-2] * nums[n-3]; // three largest
        int prod2 = nums[0] * nums[1] * nums[n-1];      // two smallest * largest
        
        return Math.max(prod1, prod2);
    }
}