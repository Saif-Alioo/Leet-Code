class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++){
            sum=Math.max(sum+arr[i],arr[i]);
            if(sum>max)
            max=sum;
        }
        return max;
    }
    
}

