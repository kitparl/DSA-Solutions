/*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/
class Solution{
    public Node deleteMaximum(Node head){
      //write your code here
      Node prev = null;
      Node max = head;
      Node c = head;
      while(c != null){
          if(c.next!=null && c.next.data>=max.data){
              max = c.next;
              prev = c;
          }
          c = c.next;
      }
      if(max!=head){
          prev.next = max.next;
      }else{
          head = head.next;
      }
      return head;
    }
  }




  ///////////////////another way to solve

  /*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/

class Solution{

  public Node deleteMaximum(Node head) {
    Node cur = head;
    while (cur != null) {
      int max = maximum(head);
      int idx = index(head, max);
      Node current = deleteNode(head, idx);
      cur = cur.next;
      return current;
    }
    return head;
  }

  private int maximum(Node head) {
    int max = Integer.MIN_VALUE;
    Node current = head;
    while (current != null) {
      if (current.data > max) {
        max = current.data;
      }
      current = current.next;
    }
    return max;
  }

  private int index(Node head, int max) {
    Node current = head;
    int idx = -1;
    int i = 0;
    while (current != null) {
      if (current.data == max) {
        idx = i;
      }
      i++;
      current = current.next;
    }
    return idx;
  }

  private Node deleteNode(Node head, int position) {
    Node current = head;
    Node previous = null;
    int i = 0;
    if (position == 0) {
      current = current.next;
      head = current;
      return head;
    } else {
      while (i < position) {
        previous = current;
        current = current.next;
        i++;
      }
      current = current.next;
      previous.next = current;
      return head;
    }
  }
    
       
  }
