package phoneLetterCombination;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  private static char[][] letters = {
    {'a', 'b', 'c'},
    {'d', 'e', 'f'},
    {'g', 'h', 'i'},
    {'j', 'k', 'l'},
    {'m', 'n', 'o'},
    {'p', 'q', 'r', 's'},
    {'t', 'u', 'v'},
    {'w', 'x', 'y', 'z'}
  };

  public static void main(String[] args) {
    String digits = "234585";
    List<String > rs = letterCombinations(digits);
    for(String s : rs) {
      System.out.println(s);
    }
  }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        result = letterCombinations(digits, 0, result);
        return result;
    }

    public static List<String> letterCombinations(String s, int index, List<String> list) {
        if(index == s.length()) {
            return list;
        }
        int digit = s.charAt(index) - '0';
        char[] chars = letters[digit - 2];
        if(list.size() == 0) {
            for(int i = 0; i < chars.length; i++) {
                list.add(String.valueOf(chars[i]));
            }
        } else {
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < list.size(); i++) {
                for(int j = 0; j < chars.length; j++) {
                    temp.add(list.get(i) + chars[j]);
                }
            }
            list = temp;
        }
        return letterCombinations(s, index + 1, list);
    }
}
