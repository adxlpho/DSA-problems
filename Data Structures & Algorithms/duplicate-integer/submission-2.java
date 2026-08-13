class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Check if the array is empty or NULL
        if (nums == null || nums.length == 0) return false;
        
        // Sort the array
        Arrays.sort(nums);
        
        // Loops through the array starting at the 2nd index and compare if they are the same
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}