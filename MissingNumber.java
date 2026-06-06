//Missing numbers
//TC - O(n)
//SC - O(1)
//Approach1 - Sum of n numbers

class MissingNum{
    public int miss(int nums[]){
        
        int n = nums.length;
        
        int totalSum = n * (n + 1)/2;
        int actualSum = 0;
        
        //filling values of actual sum
        for(int num : nums){
            actualSum += num;
        }
        
        return totalSum - actualSum;
    }
}

//Approach 2 - XOR Method

public class  MissingNumber{
    public int mis(int num){
        
        int xor = num.length;
        
        for(int i=0; i<num.length; i++){
            xor ^= i^num[i];
            
        }
        return xor;
    }
}