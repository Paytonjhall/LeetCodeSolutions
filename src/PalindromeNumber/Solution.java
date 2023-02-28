package PalindromeNumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int div = 1;
        while (x / div >= 10) {
            div *= 10;
            System.out.println(div);
        }
        while (x != 0) {
            int left = x / div;
            int right = x % 10;
            System.out.println("left: " + left + " right: " + right);
            if (left != right) {
                return false;
            }
            System.out.println("x: " + x + " div: " + div);
            System.out.println( (x % div));

            x = (x % div) / 10;


            div /= 100;

        }
        return true;
    }

}
