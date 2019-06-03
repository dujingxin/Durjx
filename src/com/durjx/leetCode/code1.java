package com.durjx.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * <p>你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * <p>示例:
 *
 * <p>给定 nums = [2, 7, 11, 15], target = 9
 *
 * <p>因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 */
public class code1 {
  public static int[] twoSum(int[] nums, int target) {

    ArrayList<Integer> arrayList = new ArrayList();
    for (int i = 0; i < nums.length; i++) {
      int result = target - nums[i];
      System.out.println("result:" + result);
      for (int j = 0; j < nums.length; j++) {
        if (result == nums[j] && i != j) {
          arrayList.add(i);
          arrayList.add(j);
          return arrayList.stream().mapToInt(Integer::intValue).toArray();
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  public static void main(String[] args) {
    int[] nums = {3, 2, 4};
    int target = 6;
    int[] result = code1.twoSum(nums, target);

    System.out.println(Arrays.toString(result));
  }
}
