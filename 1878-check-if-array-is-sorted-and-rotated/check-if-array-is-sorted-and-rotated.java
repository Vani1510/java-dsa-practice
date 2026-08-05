class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Check if current element is greater than the next element (using % n for wrap-around)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // Valid if there is at most 1 drop
        return count <= 1;
    }
}