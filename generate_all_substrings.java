//Enter code here
import java.util.*;
class Main{
    public static void Generate(int n, String str){
        // System.out.println(str);
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int tc = x.nextInt();
        for(int i=0; i<tc; i++){
            int n = x.nextInt();
            String str = x.next();
            Generate(n,str);
        }
    }
}