class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0; // constraints guarantee nums[i] >= 1, so 0 is safe as a starting floor
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;      // old max1 shifts down to max2
                max1 = nums[i];   // new max1 found
            } else if (nums[i] > max2) {
                max2 = nums[i];   // doesn't beat max1, but beats max2
            }
        }
        
        return (max1 - 1) * (max2 - 1);
    }
}