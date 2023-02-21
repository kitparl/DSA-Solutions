import java.io.*;
import java.util.*;
import java.lang.*;

class Main{

  public static long func(String s) {
    long sum = 0;
    long n = s.length();

    for (int i = 0; i < n; i++) {
        long digitValue = s.charAt(i) - 'A' + 1;
        sum += digitValue * Math.pow(26, n - i - 1);
    }

    return sum;
}


  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String str;
    for(int i = 0; i < t; i++) {
      str = s.next();
      System.out.println(func(str));
    }
  }

}
