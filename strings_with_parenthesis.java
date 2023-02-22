import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
 public static boolean func (String str){

     
     

char[] oB = {'(', '[', '{'};
char[] cB = {')', ']', '}'};

 Stack<Character> stack = new Stack<>();
 
 for(int i=0; i<str.length(); i++){
     if(new String(oB).indexOf(str.charAt(i)) != -1){
         stack.push(str.charAt(i));
     }else if(new String(cB).indexOf(str.charAt(i)) != -1){
         int id = new String(cB).indexOf(str.charAt(i));
         if(!stack.empty() && stack.peek() == oB[id]){
             stack.pop();
         }
         else{
             return false;
         }
 }

 }

return stack.empty();
 } 
 
 
 
 
 public static void main(String[] args){
 Scanner s = new Scanner(System.in);
 String str = s.nextLine();
 str = str.replaceAll("\\s+", "");
 if(func(str)){
     System.out.println("balanced");
 }else{
     System.out.println("unbalanced");
 }
 }
}