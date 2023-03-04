import java.util.*;

class Main{
    public static void func(int a, int b){
        // System.out.println(a);

        boolean f = false;
        while(a <= b){
            if(a == b){
                f = true;
                break;
                
            }
            if(b%2 == 0){
                b = b/2;
            }
            else if(b%10 == 1){
                b = b/10;
            }
            else{
                break;
        }
        }
        
        if(f){
            System.out.println("Possible");
        }
        else{
            System.out.println("Not Possible");
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while( tc --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
                    if(a == b){
            System.out.println("Possible");
            continue;
            
        }
        if(a > b){
            System.out.println("Not Possible");
             continue;
            
        }
            func(a, b);
        }
    }
}
