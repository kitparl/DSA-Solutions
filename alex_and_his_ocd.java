import java.util.*;
import java.util.Scanner;
class Main{


public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int k = 0; k<tc; k++){
        int n = sc.nextInt();

        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
    
    int c = 0;
    for(int i = 0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if((arr[i]+arr[j])%60 == 0){
                c++;
            }
        }
    }
    System.out.println(c);
}
    }
}