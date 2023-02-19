import java.io.*;
import java.util.*;
import java.lang.*;

class Main{

  public static void func(String str){

    int c = 0;
    Stack<Character> stk = new Stack();
    
    for(int i = 0; i<str.length(); i++){
        if(!stk.isEmpty() && !stk.peek().equals(str.charAt(i))){
            stk.pop();
            c++;
        }else{
            stk.push(str.charAt(i));
        }
    }
    
    if(c%2 == 0){
        System.out.println("Sachin");
    }else{
        System.out.println("Ankush");
    }
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String str;
    for(int i = 0; i < t; i++) {
      str = s.next();
     func(str);
    }
  }

}