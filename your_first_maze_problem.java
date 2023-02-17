import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

  public static void func(String str){
          int x = 0, y = 0;
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c == 'R') {
            x++;
        } else if (c == 'L') {
            x--;
        } else if (c == 'U') {
            y++;
        } else if (c == 'D') {
            y--;
        }
    }
    System.out.println(x + " " + y);
 
  }


  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String str = s.next();
    func(str);
  }
}
