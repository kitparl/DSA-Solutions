//Enter code here
import java.util.*;
class Main{
    public static boolean P(int n){
        if(n==0) { return false; }
        while(n != 1)
        {
            n = n/2;
            if(n%2 != 0 && n != 1){ return false; }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++){
            int n = sc.nextInt();
            if(P(n)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}