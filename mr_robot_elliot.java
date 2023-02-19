import java.util.*;

class Main{
public static String encrypt(String s, int low, int high) {
    if (low > high) {
        return "";
    } else {
        int mid = low + (high - low) / 2;
        return s.charAt(mid) + encrypt(s, low, mid - 1) + encrypt(s, mid + 1, high);
    }
}

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        for(int i = 0; i<tc; i++){
            int s = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            
            System.out.println(encrypt(str, 0, str.length() - 1));
        }
        
        
    }
}

