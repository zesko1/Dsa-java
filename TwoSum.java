//2Sum
//LC -1

//Optimal Approach
// TC - O(n)
// SC - O(n)

import java.util.HashMap;
class TwoSum{
    public int twoSum(int nums[], int target){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            
            int compliment = target - nums[i];
            
            if(map.containsKey(complement))//containsKey checks the number exist or not in the hashmap
            {
                return new int[]{map.get(complement), i}; //get gives the index of the number & i is the current index as we need to return the index of both the numbers
            }
            map.put(nums[i], i);//put stores the number & index into hashmap  
        }
        return new int[]{};
    }
}


//BRUTE SOLN
//TC - O(n^2)
//SC - O(1)

for(int i = 0; i < nums.length; i++)
    {
     for(int j = i + 1; j < nums.length; j++)
       { 
        if(nums[i] + nums[j] == target){
            return new int[]{i,j};
        }
    }
}
