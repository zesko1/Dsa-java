//Maximum Consecutive 1's
//TC - O(n)
//SC -O(1)
//LC - 485

class MaxOne{
    public int maxConsecutiveOne(int nums[]){
        
        int count = 0;
        int maxCount = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }
}