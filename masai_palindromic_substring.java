public static void masaiPalindromicSubstring(String str){
    //write your code here
    int max = -1;
    int x = 0;
    for(int i=0; i<str.length(); i++){
        for(int j=0; j<str.length(); j++){
            int f = 1;
            for(int k=0; k<(j-i+1)/2; k++){
                if(str.charAt(i+k)!=str.charAt(j-k)){
                    f = 0;
                }
            }
            if(f != 0 && (j-i+1) > max){
                x = i;
                max = j - i +1;
            }
        }
    }
    System.out.println(max);
  }