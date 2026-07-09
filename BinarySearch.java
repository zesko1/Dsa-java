//Binary Search LC - 704
//TC - O(logN)
//SC - O(1)

class BinarySearch{
    public int search(int[] nums, int target){
        
        int low = 0;
        int high = nums.length - 1;
        
        while(high >= low){
            int mid = low + (high - low)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
