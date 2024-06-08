class Solution {

    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[2 * n]; // Create an array of size 2n

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i]; // First half
            ans[i + n] = nums[i]; // Second half
        }

        return ans; 
    }
}
