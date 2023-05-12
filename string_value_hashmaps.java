import java.util.HashMap;
import java.util.Map;

public class string_value_hashmaps {
public static void main(String[] args) {
    String str = "abc";

    func(str);
  }
  public static void func(String str){
    Map<Character, Integer> map = new HashMap<>();
    String alpha = "abcdefghijklmnopqrstuvwxyz";

    for(int i=0; i<alpha.length(); i++){
      Character c = alpha.charAt(i);
      map.put(c, i+1);
    }
    int sum=0;
    for(int i=0; i<str.length(); i++){
      sum+=map.get(str.charAt(i));

      }
    System.out.println(sum);
    }
  }
