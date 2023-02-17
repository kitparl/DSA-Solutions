import java.util.*;
class Main{
    public static void cip(String str){  
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != '#'){
                stack.push(str.charAt(i));
                
            }else if(!stack.empty()){
                stack.pop();
            }
        }
        
        StringBuilder res = new StringBuilder();
        
        while(!stack.empty()){
            res.append(stack.pop());
        }
        
        System.out.println(res.reverse().toString());
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        for(int i = 0; i<tc; i++){
          
            String str = sc.next();
            
            cip(str);
        }
        
        
    }
}