//package ThreeSum;
//
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        int[] nums = {-1,0,1,2,-1,-4};
//        int[][] result = threeSum(nums);
//        System.out.println(result);
//    }
//
//        // Brute force method
//        public static List<List<Integer>> threeSum(int[] nums) {
//        int[][] solutions = new int[nums.length][nums.length];
//        int counter = 0;
//            for(int i = 0; i < nums.length; i++){
//                for(int j = i + 1; j < nums.length; j++){
//                    for(int k = j + 1; k < nums.length; k++){
//                        if(nums[i] + nums[j] + nums[k] == 0){
//                            solutions[counter] = new int[] {nums[i], nums[j], nums[k]};
//                            counter++;
//                        }
//                    }
//                }
//            }
//            return null;
//        }
//}
