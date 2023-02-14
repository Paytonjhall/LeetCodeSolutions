package TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSum(nums, target);
    System.out.println(result[0] + " " + result[1]);
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
      if(map.containsKey(target - nums[i])) {
        return new int [] {map.get(target - nums[i]), i};
      }
      map.put(nums[i], i);
    }
    return null;
  }
}