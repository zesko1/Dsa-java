//Rearrange Array Elements by Sign
//LC - 2149
//TC - O(n)
//SC - O(n) as we are using an extra array

import java.util.ArrayList;
class ReaarrangeArry {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];

        int pos = 0;
        int neg = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            }
            else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}
//follow up - What if the number of positive and negative elements is not equal?"

class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }

        int[] ans = new int[nums.length];
        int i = 0;
        int p = 0;
        int n = 0;

        while(p < pos.size() && n < neg.size()) {
            ans[i++] = pos.get(p++);
            ans[i++] = neg.get(n++);
        }

        while(p < pos.size()) {
            ans[i++] = pos.get(p++);
        }

        while(n < neg.size()) {
            ans[i++] = neg.get(n++);
        }

        return ans;
    }
}