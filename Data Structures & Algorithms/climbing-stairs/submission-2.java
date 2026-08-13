public class Solution {
    /**
     * This function shows the amount of ways you can like climb the stairs.
     * You can only climb 1 step or 2 steps
     * @param n The number of total steps
     * @return Returns the number of distinct ways to climb the stairs
     */
    public int climbStairs(int n) {
        // Create array of saved values
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        // Call helper function
        return climbStairsMemo(n, memo);
    }

    // Private helper that saves the recursion call instead of redoing the call again
    private int climbStairsMemo(int n, int[] memo) {
        // Base-case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Base-case
        if (memo[n] != -1) {
            return memo[n];
        }

        // Recursion-call and save it to memo
        return memo[n] = climbStairsMemo(n-1, memo) + climbStairsMemo(n-2, memo);
    }
}