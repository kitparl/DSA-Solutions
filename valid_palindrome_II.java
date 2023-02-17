import java.util.*;
class Main{
    public static boolean valLeft(String s){
                int str = 0;
        boolean f = false;
        int e = s.length()-1;
        int c = 0;
        while(str<e){
            if(s.charAt(str)!=s.charAt(e)){
                str++;
                c++;
            }else{
                str++; e--;
            }
        }
        if(c == 0 || c == 1){
            return true;
        }else{
            return false;
        }
        
    }
    public static boolean valRight(String s){
        int str = 0;
        boolean f = false;
        int e = s.length()-1;
        int c = 0;
        while(str<e){
            if(s.charAt(str)!=s.charAt(e)){
                e--;
                c++;
            }else{
                str++; e--;
            }
        }
        if(c == 0 || c == 1){
            return true;
        }else{
            return false;
        }
        
    }
    
    public static boolean val(String s){
        if(valLeft(s) || valRight(s)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        for(int i = 0; i<tc; i++){
            String str = sc.next();
            if(Main.val(str)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}