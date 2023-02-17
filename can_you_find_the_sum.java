//Enter code here
import java.util.*;
import java.util.Stack;
class Main{
    
    public static void can(int N, int[] arr){
        
    Stack<Integer> st1 = new Stack<>();
    int[] ans1 = new int[N];
    for(int i = 0; i<N; i++){
        while(!st1.empty() && arr[i]>=arr[st1.peek()]){
            st1.pop();
        }
        if(st1.empty()){
            ans1[i] = -1;
        }
        else{
            ans1[i] = st1.peek() + 1;
        }
        st1.push(i);
    }
    
        Stack<Integer> st2 = new Stack<>();
    int[] ans2 = new int[N];
    for(int i = N-1; i>=0; i--){
        while(!st2.empty() && arr[i]>=arr[st2.peek()]){
            st2.pop();
        }
        if(st2.empty()){
            ans2[i] = -1;
        }
        else{
            ans2[i] = st2.peek() + 1;
        }
        st2.push(i);
    }
    
            int [] sum = new int[N];
        for(int j=0; j<N; j++){
            sum[j] = ans1[j] + ans2[j];
        }
        
        for(int s : sum){
            System.out.print(s+" ");
        }
        
    }
    
  public static void main(String args[])  {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int arr[] =  new int[num];
      for(int i=0; i<num; i++){
          arr[i] = sc.nextInt();
      }
      can(num,arr);
  }
}