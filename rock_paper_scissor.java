import java.util.*;
public class Main {
public static void func(int n , String s, String t){
    
    // Map<Character, int[]> sc = new HashMap<>();
    // sc.put('r', new int[]{'s',0})
    
    int tss = 0; int tst = 0;
    
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == t.charAt(i)){
            continue;
        }else if((s.charAt(i) == 'r' && t.charAt(i) == 's') || (s.charAt(i) == 'p' && t.charAt(i) == 'r') || (s.charAt(i) == 's' && t.charAt(i) == 'p')){
            tss++;
        }else{
            tst++;
        }
    }
    
    if(tss> tst){
        System.out.println("First");
    }else if( tst > tss){
        System.out.println("Second");
    }else{
        System.out.println("Draw");
    }
    
}
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int n = scanner.nextInt();

 String name = scanner.next();
  String name2 = scanner.next();
 func(n,name,name2);
 }
}