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



//////////////// using hashmap




import java.util.*;

public class Main {
    public static int getMaxOccurrence(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxCount = 0;
        int maxElement = 0;
        
        // Count the occurrence of each element
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
                
                if (count > maxCount) {
                    maxCount = count;
                    maxElement = arr[i];
                }
            } else {
                map.put(arr[i], 1);
                
                if (1 > maxCount) {
                    maxCount = 1;
                    maxElement = arr[i];
                }
            }
        }
        
        return maxElement;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6};
        int maxOccurrence = getMaxOccurrence(arr);
        System.out.println("Maximum occurring element is " + maxOccurrence);
    }
}
