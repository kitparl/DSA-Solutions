//Enter code here
import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n*2];
        for(int i=0;i<n*2;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    sort(arr,j,j+1);
                }}}
        for(int i: arr){
            System.out.print(i+" ");
        }
        
    }
    static void sort(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    
}