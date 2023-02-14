package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


// leetcode 1 
// return indeces of two nums in arg array that add up to target 
public class TwoSum {
    public static void main(String[] args) {
        
        int[] nums1 = { 1,5,-3,5 }; 
        int[] nums2 = { 1,2,3,-5 }; 

        solution(nums1, 10); 
        solution(nums2, 5); 
    }

    public static void solution(int[] nums, int target){
        ArrayList<Integer> result = new ArrayList<Integer>(); 


        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target & i != j & result.size() <= 2){
                    result.add(i);
                    result.add(j);
                }
            }
        }

        while (result.size() > 2){
            result.remove(0);
        }

        System.out.println(result.toString()); 
    }

}
