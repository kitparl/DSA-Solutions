import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

  public static void cc(String str){
    
    int count = 0;

        String s = "";
    for(int i=str.length()-1; i>=0; i--){
         char C = str.charAt(i);
    s+=C;
        }
        if (s.equals(str)){
    System.out.print("Yes");
        }
        else{
            System.out.print("No");    
        }
  }
  
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String str = s.next();
    cc(str);
  }
}