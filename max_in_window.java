import java.util.*;
public class Main {
public static int[] func(int n,int k, int[] arr){
    if(arr.length == 0) 
        return arr;
    int[] res = new int[arr.length - k + 1];
    
    int cnt = 0;
    Deque<Integer> q = new ArrayDeque<>();
    for(int i=0; i<arr.length; i++){
        while(!q.isEmpty() && q.peek() < i - k + 1)
        {
            q.poll();
        }
        
        while(! q.isEmpty() && arr[q.peekLast()] < arr[i] ){
            q.pollLast();
        }
        q.offer(i);
        if(i >= k - 1){
            res[cnt++] = arr[q.peek()];
        }
    }
    return res;
}
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int n = scanner.nextInt();
 int k = scanner.nextInt();
 int[] a = new int[n];
 for (int i = 0; i < a.length; i++) {
 a[i] = scanner.nextInt();
 }
int[] arr = func( n,k, a);
StringBuilder bag = new StringBuilder();
for(int i=0; i<arr.length; i++){
    bag.append(arr[i]+" ");
}
System.out.println(bag);
 }
}