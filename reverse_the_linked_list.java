/*
class Node{
  int data;
  Node next;
  
  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
    public static Node reverseLinkedList(Node a){
        Node current = a;
          Node forward = null;
          Node backward = null;
          while (current != null) {
              forward = current.next;
              current.next = backward;
              backward = current;
              current = forward;
          }
          a = backward;
          return a;
      }
    
  }
  