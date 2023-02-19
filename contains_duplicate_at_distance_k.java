//Enter code here
import java.util.*;
import java.util.Scanner;
class Main{
    public static boolean func(int k ,int[] nums){   
         if (nums == null || nums.length <= 1 || k <= 0) {
        return false;
    }

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
        if (set.contains(nums[i])) {
            return true;
        }
        set.add(nums[i]);
        if (set.size() > k) {
            set.remove(nums[i - k]);
        }
    }
    return false;
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();
        int k = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       if(func(k,arr)){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
}
    }
}
