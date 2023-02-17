import java.util.*;
import java.io.*;
class Main{
    public static void o(int N, int [] arr){
    int count = 0 ;
    int freq = 0;
    for(int i=0;i<N;i++){
        int count1 = 0;
        for(int j=0;j<N;j++){
            if(arr[i]  == arr[j]){
                count1++;
            }
        }
        if (count1 > count) {
        count = count1;
        freq = arr[i];
    }
    }
    System.out.print(freq);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        o(N,arr);
    }
}