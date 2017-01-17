package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * twoSum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author milo
 * @create 2017-01-17
 */

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {

                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSumB(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i ;
                return result;
            }

            map.put(nums[i], i);

        }


        return result;
    }


    public static void main(String[] args) {

        int[] nums = {0, 4, 3, 0};
        int target = 0;

        int[] ints = twoSumB(nums, target);
        for (int anInt : ints) {
            System.out.println("----------------------anInt值=" + anInt + "," + "当前类是=twoSum.main()");
        }

    }

}
