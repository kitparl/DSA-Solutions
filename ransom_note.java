//Enter code here
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
                int m = x.nextInt();
                
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            String str = x.next();
            list.add(str);
        }
        List<String>list2 = new ArrayList <>();
        for(int i=0; i<m; i++){
            String str2 = x.next();
            list2.add(str2);
        }
        boolean flag = true;
        for(int i = 0; i<list2.size(); i++){
            boolean fl = true;
            for(int j=0; j<list.size(); j++){
                if(list2.get(i).equals(list.get(j))){
                    fl = false;
                    break;
                }
            }
            if(fl){
                System.out.println("No");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }

    }
}