//Enter code here
import java.util.*;
class Main{
    public static boolean checkPrime(int num){
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(checkPrime(n1) && checkPrime(n2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}