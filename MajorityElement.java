//Majority Element
//TC - O(n)
//SC - O(1)
//Approach - Demoorey Voting algo

class MajorityElement{
    public int majorityelement(int[] nums){
        
        int cnt = 0;
        int element = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(cnt == 0){
                element = nums[i];
            }
            if(nums[i] == element){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        //If the interviewer says "What if a majority element is not guaranteed? then add this too
        
        int freq = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element){
                freq++;
            }
        }
        
        if(freq > nums.length/2){
            return element;
        }
        return -1;
    }
}