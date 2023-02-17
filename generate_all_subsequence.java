import java.util.*;
import java.util.List;

public class Main {
  public static void gAll(String string, int size) {
    gS(string, new ArrayList<>(), 0);
  }

private static void gS(String string, List<Character> newString, int curr) {
    if (newString.size() > 0) {
        StringBuilder sb = new StringBuilder();
        for (Character ch : newString) {
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
    if (curr == string.length()) {
        return;
    }
    for (int i = curr; i < string.length(); i++) {
        newString.add(string.charAt(i));
        gS(string, newString, i + 1);
        newString.remove(newString.size() - 1);
    }
}
  
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String str = s.next();
    gAll(str,n);
  }

}

