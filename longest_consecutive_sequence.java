import java.util.*;
import java.util.Scanner;
class Main{
    public static int func(int n ,int[] arr){ 
        Arrays.sort(arr);
        int a = 0; int c = 0;
        
        ArrayList<Integer> v = new ArrayList<>();
        v.add(arr[0]);
        
        for(int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                v.add(arr[i]);
            }
            
        }
        
        for(int i=0; i< v.size(); i++){
            if(i>0 && v.get(i) == v.get(i-1)+1){
                c++;
            }else{
                c = 1;
                
            }
            a = Math.max(a, c);
        }
        
        return a;
        
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();
        // int k = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       System.out.println(func(n,arr));
}
    }
}