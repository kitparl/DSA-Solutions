/*
class Node{
  int data;
  Node next;
  public Node(){
    this.next = null;
    this.data = 0;
  }
  public Node(int data,Node next){
    this.next = next;
    this.data = data;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/


class Solution{
  
    public static Node rotateNode(Node a,int k,int n){
      if (a == null || k == 0 || n == 1) {
        return a;
      }
      
      int rot = k % n;
      if (rot == 0) {
        return a;
      }
      
      Node tail = a;
      for (int i = 0; i < n - 1; i++) {
        tail = tail.next;
      }
      
      tail.next = a;
      Node newTail = a;
      for (int i = 0; i < n - rot - 1; i++) {
        newTail = newTail.next;
      }
      
      Node newHead = newTail.next;
      newTail.next = null;
      
      return newHead;
    }
  }
  