// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//Approach - Two pointer approach, one pointer to keep track of the last unique element and another pointer to traverse the array. Whenever we find a new unique element, we move the first pointer and update the value at that position with the new unique element. Finally, we return the length of the unique elements which is the position of the first pointer + 1.
//Time Complexity - O(n) where n is the length of the input array.
//Space Complexity - O(1) as we are not using any extra space to store the unique elements, we are modifying the input array in place.
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        int n = nums.length;

        for(int j = 1; j < n; j++)
        {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

} 