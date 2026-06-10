//Sort color or sort 0,1,2
// Approach - Dutch National flag
// TC - O(n)
//SC - O(1)
//in dutch algo - 0 - low-1 = 0 sorted & on extreme rigth
//low - mid-1 = 1 sorted
//mid - high unsorted can be 0,1,2
//high+1 - n-1 - 2 sorted & extreme left 

class SortColors{
    public int sortColors(int[] nums){
        
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while(mid <= high){
            if(nums[mid] == 0){
                int swap = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = swap;
                    low++;
                    mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int swap = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = swap;
                    high--;
            }
        }
    }
}