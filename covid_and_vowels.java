import java.util.*;

class Main {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(CovidVowels(str));
    }
    
    
        public static int CovidVowels(String str){
            int count =0;
            for(int i=0; i<str.length(); i++){
                String sum = "";
                for(int j = i; j<str.length(); j++) {
                    sum +=str.charAt(j);
                    if(sum.length()>=4) {
                        if (sum.contains("a")&& 
                            sum.contains("i")&& 
                            sum.contains("u")&& 
                            sum.contains("o")){
                                count++;
                            } 
                    }
                }
            }
            return count;
        }

}