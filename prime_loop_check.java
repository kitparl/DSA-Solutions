import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
   
        for(int i=1;i<=n;i++){
           if(identifyPrime(i)){
        System.out.println(i);
           }
        }
        
    }
    
    public static boolean identifyPrime(int num){
         int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count == 2){
           return true;
        }
        else{
           return false;
        }
    }
    
}