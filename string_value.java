import java.util.*;

public class Main {
public static void func(String S){
        String letter = "abcdefghijklmnopqrstuvwxyz";
    Map<Character, Integer> object = new HashMap<>();
    for (int i = 0; i < letter.length(); i++) {
        char y = letter.charAt(i);
        object.put(y, i + 1);
    }
    int sum = 0;
    for (int j = 0; j < S.length(); j++) {
        sum = sum + object.get(S.charAt(j));
    }
    System.out.println(sum);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String name = scanner.next();
        func(name);
    }
} 
