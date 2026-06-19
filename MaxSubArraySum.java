//Maximum SubArray Sum LC -53
//Approach - Kadane's Algo
//TC - 0(n)
//SC - O(1)
//SubArray - contigous array

class MaxSubArraySum{
    public int maxSubArray(int[] nums){
        
        int maxSum = nums[0];
        int sum = 0;
        
        if(int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            if(sum < 0){
                sum = 0;
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}

//FOLLOW UP - if "Print the maximum subarray" (or return the subarray itself). asked instead of Maximum SubArray Sum
//TC & SC remain same 

class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for(int i = 0; i < nums.length; i++){

            if(sum == 0){
                tempStart = i;
            }

            sum += nums[i];

            if(sum > maxSum){
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println("Subarray:");
        for(int i = start; i <= end; i++){
            System.out.print(nums[i] + " ");
        }

        return maxSum;
    }
}
