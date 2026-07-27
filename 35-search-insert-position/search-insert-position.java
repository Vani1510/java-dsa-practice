class Solution {
    public int searchInsert(int[] nums, int target) {
        int insertpos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(target>nums[i]){
                insertpos++;
            }}
        
        return insertpos;
    }
}