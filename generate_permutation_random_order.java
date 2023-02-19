class Solution{
    public List<List<Integer>> generatePermutation(int[] a){
      //write your code here.
       List<List<Integer>> result = new ArrayList<>();
          List<Integer> tempList = new ArrayList<>();
          boolean[] used = new boolean[a.length];
          backtrack(a, used, tempList, result);
          return result;
    }
    
    private void backtrack(int[] a, boolean[] used, List<Integer> tempList, List<List<Integer>> result) {
          if (tempList.size() == a.length) {
              result.add(new ArrayList<>(tempList));
          } else {
              for (int i = 0; i < a.length; i++) {
                  if (used[i] || (i > 0 && a[i] == a[i-1] && !used[i-1])) {
                      continue;
                  }
                  used[i] = true;
                  tempList.add(a[i]);
                  backtrack(a, used, tempList, result);
                  used[i] = false;
                  tempList.remove(tempList.size() - 1);
              }
  }
  }
  }
  