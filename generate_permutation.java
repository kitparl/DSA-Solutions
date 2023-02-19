import java.util.*;
public class Main {
    
 public static void func(int[] arr, int size) {
        List<Integer> newArr = new ArrayList<>();
        gp(arr, 0, newArr);
        Collections.sort(newArr);
        for (int element : newArr) {
            String finalString = "";
            String[] digits = String.valueOf(element).split("");
            for (String digit : digits) {
                finalString += digit + " ";
            }
            System.out.println(finalString.trim());
        }
    }
    
     public static void gp(int[] arr, int curr, List<Integer> result) {
        if (curr == arr.length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            result.add(Integer.parseInt(sb.toString()));
            return;
        }
        for (int i = curr; i < arr.length; i++) {
            swap(arr, i, curr);
            gp(arr, curr + 1, result);
            swap(arr, i, curr);
        }
    }

 public static void swap(int[] arr, int i, int curr) {
        int temp = arr[i];
        arr[i] = arr[curr];
        arr[curr] = temp;
    }

    
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
   
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	func(a,n);
    }
}
