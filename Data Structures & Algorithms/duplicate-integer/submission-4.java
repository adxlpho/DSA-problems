class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Check if the array is sorted or null
        if (nums == null || nums.length == 0) return false;

        // Sort it
        Arrays.sort(nums);

        // Check if the first and last elements are the same
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}