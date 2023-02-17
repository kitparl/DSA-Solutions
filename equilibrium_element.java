import java.util.*;
class Main{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        int i=0;int j=n-1;int sum1=0;int sum2=0;
        while(i<j){
            if(sum1==sum2){
                sum1+=arr[i];sum2+=arr[j];
                i++;j--;
            }
            if(sum1<sum2){
               sum1+=arr[i];
               i++;
            }
            if(sum1>sum2){
               sum2+=arr[j];
               j--;
            }}
        if(sum1==sum2){
            System.out.println(i+1);
        }
        else{
            System.out.println(-1);
        }}}