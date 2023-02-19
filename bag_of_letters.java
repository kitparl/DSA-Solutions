import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int m = sc.nextInt();
        String b = sc.next();
        
          bagOfLetters(a,b);
      
    }

public static void bagOfLetters(String A, String B) {

  char[] b = B.toCharArray();
   
  boolean res = true;
   
  for(int i=0; i<b.length; i++){
      if(!A.contains(String.valueOf(b[i]))){
          res = false;
          break;
      }
  }
   
  if(res){
      System.out.println("Yes");
  }else{
      System.out.println("No");
  }
   
}
}
