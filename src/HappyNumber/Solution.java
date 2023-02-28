package HappyNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isHappy(13));
    }

    public static List<Integer> visited = new ArrayList<>();
    public static boolean isHappy(int n) {
        System.out.println("n: " + n);
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            System.out.print(temp + "^2 + ");
            n /= 10;
        }
        System.out.println(" = " + sum);

        if (sum == 1) {
            visited.clear();
            return true;
        } else {
            if (visited.contains(sum)) {
                return false;
            } else {
                visited.add(sum);
                return isHappy(sum);
            }
        }
    }
}
