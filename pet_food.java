//Enter code here
import java.util.*;
class Main{
    public static void food(int a, int b, int c, int x, int y){
        // System.out.println(b);
        if(a+c>=x && b+c>=y && a+b+c>=x+y){
            System.out.println("YES");
        }
        // else if(){
            
        // }
        else{
            System.out.println("NO");
            
        }
    }
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int tc = x.nextInt();
        for(int i=0; i<tc; i++){
            int a = x.nextInt();
            int b = x.nextInt();
            int c = x.nextInt();
            int d = x.nextInt();
            int e = x.nextInt();
        food(a,b,c,d,e);
        }
    }
}