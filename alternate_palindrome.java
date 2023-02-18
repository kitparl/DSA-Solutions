import java.util.*;

class Main{
    public static String createString(String s){
        String res = "";
        int i=0; 
        int j = s.length()-1;
        while(i < j){
            res += s.charAt(i);
            res += s.charAt(j);
            
            i++;
            j--;
        }
        return res;
    }
    public static boolean func(char[] s){   
        
        // System.out.println(str);
        int i=0;
        int j= s.length -1;
        while(i<j){
            if(s[i] != s[j])
                return false;
                
            i++;
            j--;
            
        }
        return true;
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        for(int i = 0; i<tc; i++){
            int s = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            
            String mains = createString(str);
            
            if(func(mains.toCharArray())){
                System.out.println("Yes");
            }else{
                System.out.println("No"); 
            }
        }
        
        
    }
}