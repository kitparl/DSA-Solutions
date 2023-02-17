import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

  public static void func (String str){
   Stack<Character> s = new Stack<>();
    int i = 0;
    while (i < str.length()) {
        if (s.empty() || str.charAt(i) != s.peek()) {
            s.push(str.charAt(i));
            i++;
        } else {
            s.pop();
            i++;
        }
    }
    if (s.empty()) {
        System.out.println("Empty String");
    } else {
        StringBuilder short_string = new StringBuilder();
        for (Character c : s) {
            short_string.append(c);
        }
        System.out.println(short_string.toString());
    }  }


  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String str = s.next();
    func(str);
  }
}


