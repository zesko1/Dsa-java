// Leetcode 283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/description/
// Algorithm: Two Pointer Approach
// Time Complexity: O(n)
// Space Complexity: O(1)
class MoveZeores {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int j = -1;

        //for finding first zero 
        for(int i = 0; i < n; i++){
            if(nums[i] == 0)
            {
                j = i;
                break;
            }
        }

        // If no zero exists
        if(j == -1) {
            return;
        }

        //for moving non zero values forward
        for(int i = j + 1; i < n; i++){
            if(nums[i] != 0)
            {
                int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                    j++;
            }
        }
    }
}