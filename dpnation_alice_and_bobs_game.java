import java.util.*;
import java.util.Scanner;
class Main{
    public static boolean func(int n){      
            if (n % 2 == 0) {
        return true;
    } else {
        return false;
    }
        
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();
           System.out.println(func(n));
      }
}
}


