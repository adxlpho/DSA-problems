class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Create prefix, suffix, and output to track
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] output = new int[nums.length];

        // Boundaries
        prefix[0] = 1;
        suffix[nums.length - 1] = 1;

        // Iterate through prefix to multiply all previous elements
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Iterate through suffix to multiply all future elements
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Iterate to combine the prefix and suffix
        for (int i = 0; i < nums.length; i++) {
            output[i] = prefix[i] * suffix[i];
        }
        return output;
    }
}  
