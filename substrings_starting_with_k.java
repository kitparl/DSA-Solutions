import java.util.*;

class Main{
    public static void cip(int N , String A, char K){
            List<String> bag = new ArrayList<>();
    int count = 0;
    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j <= N; j++) {
            bag.add(A.substring(i, j));
        }
    }
    for (int i = 0; i < bag.size(); i++) {
        String str = bag.get(i);
        if (str.charAt(0) == K) {
            count++;
        }
    }
    System.out.println(count);
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        for(int i = 0; i<tc; i++){
            int n = sc.nextInt();
           
            String str = sc.next();
            char k = sc.next().charAt(0);
            
            cip(n,str,k);
        }
        
        
    }
}
