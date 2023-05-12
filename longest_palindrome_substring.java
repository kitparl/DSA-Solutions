//Input: thisracecarisgood ------------ output: 7

public class _04_longest_Substring_Palindrome {
  public static void main(String[] args) {
    String str  = "thisracecarisgood";

    System.out.println(func(str));
  }
  public static int func(String S) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < S.length(); i++) {
      String bag = "";
      for (int j = i; j < S.length(); j++) {
        bag += S.charAt(j);
        if (bag.length() > max && isPalindrome(bag)) {
          max = bag.length();
        }
      }
    }

    return max;
  }

  public static boolean isPalindrome(String str) {
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }
    return str.equals(reverse);
  }

}
