import java.util.*;
import java.util.Scanner;
class Main{
 public static int func(int n){ 
     int c = 0;
     int[] t = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
     
     for(int i=0; i<t.length; i++){
         c+= n/ t[i];
         n = n % t[i];
     }
     
     return c;
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