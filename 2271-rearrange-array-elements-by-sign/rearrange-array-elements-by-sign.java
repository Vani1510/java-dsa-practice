class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int posIndex = 0; // Pointer for positive numbers
        int negIndex = 1; // Pointer for negative numbers

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res[posIndex] = nums[i];
                posIndex += 2; // Move to the next even index
            } else {
                res[negIndex] = nums[i];
                negIndex += 2; // Move to the next odd index
            }
        }

        return res;
    }
}