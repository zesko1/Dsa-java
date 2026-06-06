// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//TC - O(n + m) where n and m are the lengths of the two input arrays
//SC - O(k)
//Approach - We can use two pointers to traverse both arrays simultaneously. We will sort both arrays first, and then compare the elements at the current pointers. If they are equal, we add the element to the result list and move both pointers. If the element in nums1 is smaller, we move the pointer in nums1. If the element in nums2 is smaller, we move the pointer in nums2. This way, we can efficiently find the intersection of the two arrays while ensuring that each element in the result is unique.

import java.util.*;

public class Intersection {
    public static int[] intersect(int[] nums1, int[] nums2)  {
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            int i=0;
            int j=0;

            ArrayList<Integer> ans = new ArrayList<>();
            while(i < nums1.length && j < nums2.length){
                if(nums1[i] < nums2[j]){
                    i++;
                }
                else if(nums1[i] > nums2[j]){
                    j++;
                }
                
                else{
                    ans.add(nums1[i]);
                    i++;
                    j++;
                }
            }
            int result[] = new int[ans.size()];
            for(int k=0; k<ans.size(); k++){
                result[k] = ans.get(k);
            }
            return result;
       
        }
}


