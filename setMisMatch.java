class Solution {
    public int[] findErrorNums(int[] nums) {
//         Arrays.sort(nums);
//         int missing=0,same=0;
        
//         int min=nums[0];
//         int max=nums[nums.length-1];
        
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==nums[i+1])
//                 same=nums[i];
//             if(nums[i+1]-nums[i]>1)
//                 missing=nums[i]+1;
//         }
//         if(missing==0){
//             if(min!=1)
//                 missing=1;
//             else
//                 missing=max+1;
//         }
//         int result[]=new int[2];
//         result[0]=same;
//         result[1]=missing;
//         return result;
        
        int[] count = new int[nums.length];  //Creating a new array with same length of prev array.
        int[] result = new int[2];           //Creating a array for storing data.
        for (int num : nums) { 
            count[num - 1]++;                //Count the occurnce of each number and store in count array.
        }
        for (int i = 0; i < nums.length; i++) {
            if (count[i] == 2) {                   //if value of count is 2 means two numbers are same
                result[0] = i + 1;                 //Then the repeted number.
            }
            if (count[i] == 0) {                  //if Count value is 0 means a number is missing in count array 
                result[1] = i + 1;                //missing number
            }
        }
        return result;
    }
}
