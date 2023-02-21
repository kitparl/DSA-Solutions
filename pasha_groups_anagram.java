import java.util.*;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            HashMap<String, List<String>> anagrams = new HashMap<>();
            while (n > 0) {
                String str = sc.next();
                char[] arr = str.toCharArray();
                Arrays.sort(arr);
                String key = new String(arr);
                if (anagrams.containsKey(key)) {
                    List<String> list = anagrams.get(key);
                    list.add(str);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(str);
                    anagrams.put(key, list);
                }
                n--;
            }
            for (String key : anagrams.keySet()) {
                List<String> list = anagrams.get(key);
                System.out.println(list.size());
                for (String str : list) {
                    System.out.println(str);
                }
            }
            t--;
        }
    }
}