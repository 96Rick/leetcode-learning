import java.util.HashMap;

/*
 * @Question: 
 * 
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * @level: Easy
 *  
 */

// @language: java
class Solution {
    // @A1:
    public int[] twoSum1(int[] nums, int target) {
        HashMap <Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
           if (record.containsKey(temp)) {
               return new int[]{record.get(temp), i};
           }
           record.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
    // @A2:
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}




