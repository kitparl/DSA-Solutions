import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

public static void func(int n, String str) {
    List<Character> arr = new ArrayList<>();
    for(int i = 0; i < str.length(); i++){
        if(arr.contains(str.charAt(i)))
            arr.remove(arr.indexOf(str.charAt(i)));
        else
            arr.add(str.charAt(i));
    }

    if((str.length() % 2 == 0 && arr.size() == 0) || (str.length() % 2 == 1 && arr.size() == 1)){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}



  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String str = s.next();
    func(n,str);
  }
}

