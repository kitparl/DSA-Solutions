import java.util.*;

class Main{
    public static void cip(String str){
        char s[] = str.toCharArray();
        char current = s[0];
        int count = 1;
        StringBuilder res = new StringBuilder(99);
        for(int i = 1; i<s.length; i++){
            if(s[i]== current){
                count++;
            }else{
                res.append(current+""+count);
                current = s[i];
                count = 1;
            }
        }
        res.append(current+""+count);
        System.out.println(res.toString());
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        for(int i = 0; i<tc; i++){
            int s = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            
            cip(str);
        }
        
        
    }
}