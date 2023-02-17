import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
    
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u';
    }
    public static void swap(char[] ch, int left, int right){
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
    }

  public static void func(String str){
    
        int left = 0; int right = str.length() - 1;
        
        char[] ch = str.toCharArray();
        while(left<right){
            if(isVowel(ch[left]) && isVowel(ch[right])){
                swap(ch, left, right);
                left++;
                right--;
            }
            if(!isVowel(ch[left])) 
                left++;
            if(!isVowel(ch[right])) 
                right--;
            
            
        }
        for(char c: ch){
            System.out.print(c);
        }
    
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String str;
    // for(int i = 0; i < t; i++) {
    while(t-->0){
      str = s.next();
      func(str);
      System.out.println();
    }
  }

}