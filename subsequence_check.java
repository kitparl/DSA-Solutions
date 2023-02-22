import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        Stack<Character> stc = new Stack<Character>();

        for(int i=s1-1; i>=0; i--){
            stc.push(str1.charAt(i));
        }

        for(int i=0; i<s2; i++){
            if(!stc.empty() && stc.peek()==str2.charAt(i)){
                stc.pop();
            }
        }

        if(stc.empty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
