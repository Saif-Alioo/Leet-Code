//https://leetcode.com/problems/maximum-subarray/
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.


class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length<2)
            return nums[0];
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            if(sum>max)
                max=sum;
        }
      return max;
    }
}
