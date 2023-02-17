// Given an array of N integers, print the 3 distinct maximum and 3 minimum elements of the array

import java.util.*;
public class Main {
public static void func(int n,  int[] arr){
    // System.out.println(arr[n-1]);
    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    // List<Integer> p = new ArrayList<>();
    Stack<Integer> p= new Stack<>();
    
    int sum = 0;
    for(int i=0; i<arr.length; i++){
        if(i == 0 || arr[i] != arr[i-1]){
            p.push(arr[i]);
            sum+=arr[i];
        }
    }
    if(p.size() >= 5){
        System.out.println(p.get(0) + " " + p.get(1) + " " + p.get(2));
    }else{
        System.out.println("Not Possible");
    }
    
    if(p.size() > 2){
        // System.out.println(p[p.length-3] + " " + p[p.length-2] + " " + p[p.length-1]);
          System.out.println(p.get(p.size() - 3) + " " + p.get(p.size() - 2) + " " + p.get(p.size() - 1));
    }else{
             System.out.println("Not Possible");  
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
	func(n, a);
    }
}