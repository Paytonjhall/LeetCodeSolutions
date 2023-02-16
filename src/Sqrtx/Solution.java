package Sqrtx;

public class Solution {
  public static void main(String[] args) {
    System.out.println(mySqrt(168));
  }

  public static int mySqrt(int x) {
    if(x == 0) {
      return 0;
    } else if (x < 4) {
      return 1;
    }
    int value = 2;
    while (true) {
      if(value * value > x) {
        return value-1;
      }
      value ++;
      }
    }
}
