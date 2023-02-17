public static void decompressTheString(String st){
    String b = "";
for(int i=0; i<st.length(); i++){
  if(i%2==1){
      int x = st.charAt(i);
      int y = x-48;
      
      for(int j=0; j<y; j++){
          b = b + st.charAt(i-1);

      }
  }
}
  // int i,j;

  // for(i=0;i<s.length();i++)
  // {
  //     String sum = "";
  //     int k=s.charAt(i);
  //     if(k>=48 && k<=57)
  //     {
  //         for(j=49;j<k;j++)
  //             sum=sum+s.substring(0,i);
  //     }
  //     String c=k-48+"";
  //     s=s.replaceFirst(c,sum);
  // }

  // System.out.println(s);
          System.out.println(b);
}