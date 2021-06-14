class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
          int n=nums.length;
        // Ensure that n is at the last index
        if (nums[n-1] != n) {
            return n;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }

        // If we get here, then the missing number is on the range (0, n)
        for (int i = 1; i < n; i++) {
            if (nums[i]+1 != nums[i]) {
                return nums[i]+1;
            }
        }

        // Array was not missing any numbers
        return -1;
    }
}
