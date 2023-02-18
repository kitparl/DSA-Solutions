import java.io.*;
import java.util.*;
import java.lang.*;

class Main{

  public static void func(String str){
     int max = 26;
    String bag = "";

    int[] count = new int[max];
    Queue<Character> queue = new LinkedList<>();

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        queue.add(c);

        count[c - 'a']++;

        while (!queue.isEmpty()) {
            if (count[queue.peek() - 'a'] > 1) {
                queue.poll();
            } else {
                bag += queue.peek();
                break;
            }
        }

        if (queue.isEmpty()) {
            bag += "#";
        }
    }

    System.out.println(bag);
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String str;
    for(int i = 0; i < t; i++) {
      str = s.next();
      func(str);
    }
  }

}

