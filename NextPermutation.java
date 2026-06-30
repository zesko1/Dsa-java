//LC -31 Next Permutation
//TC - O(n)
//SC - O(1)
//BRUTE - find all possible permutations using recursion then do the linear search for the given permutation then return the next permy=utation TC - O(N! * n)

class NextPermutation{
    public void swap(int[] nums, int i, int j){
            
            int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
    }
    
    private void reverse(int nums[], int left, int right){
        
                while(left < right){
                    swap(nums, left, right);
                    left++;
                    right--;
                }
    }
    
    public void nextPermutation(int[] nums){
        
        int index = -1;
        int n = nums.length;
        
        //finf the breakpoint
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
        }
        
        //if no breakpoint exist so the 1st index or permutaion will be ur answer
        if(index == -1){
        reverse(nums, 0, n-1);
        retrun;
        }
        
        //swap the smallest num greater than index
        
        for(int i = n - 1; i > index; i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        
        //reverse the remaining index + 1 to n-1 to get the shortest possible permutation
        
        reverse(nums, index + 1, n - 1);
    }
}