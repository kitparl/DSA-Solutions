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