import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    char[]arr = new char[n];
    for(int i=0;i<n;i++){
        arr[i]=str.charAt(i);
    }
    Arrays.sort(arr);
     int [] freq = new int [arr.length];  
        int v = -1;  
        
        for(int i = 0; i < n; i++){  
            int count = 1;  
            for(int j = i+1; j < n; j++){  
                if(arr[i] == arr[j]){  
                    count++;   
                    freq[j] = v;  
                }  
            }  
            if(freq[i] != v)  
                freq[i] = count;  
        }  
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != v)  
                System.out.println(arr[i] + "-" + freq[i]);  
} } }