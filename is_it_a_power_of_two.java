import java.util.*;
class Main{
    public static boolean func(int n){
        return (n>0) && ((n & (n - 1)) == 0);
    }
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++){
            int n = sc.nextInt();
            if(func(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}