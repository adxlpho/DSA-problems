class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Check if nums is NULL or empty
        if (nums == null || nums.length == 0) return new int[0];

        // Check if its one value only the integer
        if (nums.length == 1) return new int[]{nums[0]};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
