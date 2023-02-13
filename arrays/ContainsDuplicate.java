package arrays;

import java.util.HashMap;

// leetcode 217
// returns a boolean 
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1,2,3,4 };
        int[] nums3 = { 1,1,1,2,3,4,2 };

        containsDuplicate(nums1);
        containsDuplicate(nums2);
        containsDuplicate(nums3);

    }

    public static void containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> numCounts = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (numCounts.get(currentNum) != null) {
                numCounts.put(currentNum, numCounts.get(currentNum) + 1);
            } else {
                numCounts.put(currentNum, 1);
            }
            for (Integer key : numCounts.keySet()) {
                Integer currentVal = numCounts.get(key);
                if (currentVal > 1) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
        return;
    }
}
