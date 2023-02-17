import java.io.*;
import java.util.*;
import java.lang.*;


class Main{
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int tc = s.nextInt();
    for(int i = 0; i<tc; i++){
        int size = s.nextInt();
        s.nextLine();
            String str = s.nextLine();
            Decipher(str);
    }
  }
  public static void Decipher(String str){
    String b = "";
    for(int i =0; i<str.length(); i=i+2){
        char ch = str.charAt(i);
        int n = str.charAt(i+1)-48;
        for(int j=0; j<n; j++){
            b+=ch;
        }
    }
    System.out.println(b);
  }
  
}