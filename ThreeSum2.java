//3Sum LC - 15
//TC - O(n^2)
//SC - O(no. of triplets stored)

class ThreeSum2{
    public List<List<Integer>> threeSum(int[] nums){
        
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 2; i++){
            
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
             int left = i + 1;
             int right = nums.length - 1;
             while(left < right){
                 
            int sum = nums[i] + nums[left] + nums[right];
                 
                 if(sum < 0){
                     left++;
                 }
                 else if(sum > 0){
                     right--;
                 }
                 else{
                     
                     ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                     
                     left++;
                     right--;
                     
                     while(left < right && nums[left] == nums[left - 1]){
                         left++;
                     }
                     while(left < right && nums[right] == nums[right + 1]){
                         right--;
                 }
             }
        }
        return ans;
    }
}