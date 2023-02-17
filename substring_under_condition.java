import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

  public static void func (String s){
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        String str = "";

        for (int j = i; j < s.length(); j++) {
            str = str + s.charAt(j);

            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                count++;
            }
        }
    }
    System.out.println(count);  
      
  }


  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String str = s.next();
    func(str);
  }
}
