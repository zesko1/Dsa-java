//Single number 
//LC - 136
//TC - O(n)
//SC - O(1)
//Approach - XOR Approach

class SingleNumber{
    public int singleNum(int[] nums){
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor ^=nums[i];
        }
        return xor;
    }
}