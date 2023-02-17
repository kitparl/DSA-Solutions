import java.io.*;
import java.util.*;
import java.lang.*;

class Main{

  public static void func(String str){
        String bag1 = "";
    char bag2 = '\0';
    for (int i = 0; i < str.length(); i++) {
        if (bag2 != str.charAt(i)) {
            bag1 += str.charAt(i);
            bag2 = str.charAt(i);
        }
    }
    System.out.println(bag1);
    
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String str;
   while( t--> 0){
      str = s.next();
      func(str);
    }
  }

}

