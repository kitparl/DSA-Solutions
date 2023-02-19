import java.util.*;
public class Main {
public static void func(String day, int N){
        Map<String, Integer> obj = new HashMap<String, Integer>();
    String[] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    for (int i = 0; i < weekDay.length; i++) {
        obj.put(weekDay[i], i + 1);
    }
    int d = N % 7;
    int f = (obj.get(day)) + d;
    if (f > 7) {
        f = f % 7;
    }
    for (String key : obj.keySet()) {
        if (obj.get(key) == f) {
            System.out.println(key);
        }
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        func(str,n);
    }
}

