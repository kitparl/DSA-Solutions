import java.util.*;
public class Main {
public static void func(int K,  int[] arr){
    boolean[] flag = { false };
    getSubset(arr, new ArrayList<Integer>(), 0, K, flag);
    if(flag[0]) {
        System.out.println("yes");
    } else {
        System.out.println("no");
    }
    
}

public static void getSubset(int[] arr, List<Integer> newArr, int curr, int K, boolean[] flag) {
   if (curr == arr.length) {
        int sum = 0;
        for (int i = 0; i < newArr.size(); i++) {
            sum += newArr.get(i);
        }
        if (sum == K) {
            flag[0] = true;
        }
        return;
    }
    getSubset(arr, newArr, curr + 1, K, flag);
    List<Integer> concatList = new ArrayList<>(newArr);
    concatList.add(arr[curr]);
    getSubset(arr, concatList, curr + 1, K, flag);
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int k = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	func( k, a);
    }
}
