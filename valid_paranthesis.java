import java.util.*;
class Solution {

 public  boolean checkPair(char p, char c){

     return (p == '(' &&  c == ')') || (p == '[' && c == ']') || (p == '{' && c == '}');

 }

    public boolean isValid(String s) {
        Stack st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(letter == '(' || letter == '[' || letter == '{'){
                st.push(letter);
            }
             
            else{
            if (st.isEmpty()) {
                return false;
            }
            if (!checkPair((char) st.peek(), letter)) {
                return false;
            }
            st.pop();
        }
    }
        return st.isEmpty();
}
}