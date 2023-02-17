public static void countSuchPairs(int n,int k, int[] arr){
    int c = 0;
int s = 0;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (i != j && arr[i] + arr[j] == k) {
            if (arr[i] < arr[j]) {
                c++;
            } else if (arr[i] == arr[j]) {
                s++;
            }
        }
    }
}
if (s != 0) {
    System.out.println((c + s/2));
} else {
    System.out.println(c);
}
}
