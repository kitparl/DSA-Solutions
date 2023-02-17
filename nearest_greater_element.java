// 5
// 5 4 1 3 2

// -1 5 4 4 3

//nearest closest element


import java.util.*;
public class Main {
    public static int[] NearestGreaterElementLeft(int size, int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int[] left = new int[size];
    for (int i = 0; i < size; i++) {
        while (!stack.empty() && arr[i] >= arr[stack.peek()]) {
            stack.pop();
        }
        if (stack.empty()) {
            left[i] = -1;
        } else {
            left[i] = stack.peek();
        }
        stack.push(i);
    }
    return left;
}

public static int[] NearestGreaterElementRight(int size, int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int[] right = new int[size];
    for (int j = size - 1; j >= 0; j--) {
        while (!stack.empty() && arr[j] >= arr[stack.peek()]) {
            stack.pop();
        }
        if (stack.empty()) {
            right[j] = -1;
        } else {
            right[j] = stack.peek();
        }
        stack.push(j);
    }
    Collections.reverse(Arrays.asList(right));
    return right;
}

public static void nge(int size, int[] arr) {
    int[] left = NearestGreaterElementLeft(size, arr);
    int[] right = NearestGreaterElementRight(size, arr);
    int[] ans = new int[size];
    for (int i = 0; i < size; i++) {
        if (left[i] == -1 && right[i] == -1) {
            ans[i] = -1;
        } else if (right[i] == -1) {
            ans[i] = arr[left[i]];
        } else if (left[i] == -1) {
            ans[i] = arr[right[i]];
        } else {
            int le = Math.abs(i - left[i]);
            int ri = Math.abs(i - right[i]);
            if (le > ri) {
                ans[i] = arr[right[i]];
            } else {
                ans[i] = arr[left[i]];
            }
        }
    }
    System.out.println(Arrays.toString(ans).replaceAll("[\\[\\],]", ""));
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       nge(n,arr);
}
    }
}



