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
    public Node addTwoLinkedList(Node head1,Node head2){
        int carry = 0;
      Node dummyHead = new Node(0);
      Node curr = dummyHead;
      
      while(head1 != null || head2 != null){
          int x = (head1 != null) ? head1.data : 0;
          int y = (head2 != null) ? head2.data : 0;
          int sum = carry + x + y;
          carry = sum / 10;
          curr.next = new Node(sum % 10);
          curr = curr.next;
          if (head1 != null) head1 = head1.next;
          if (head2 != null) head2 = head2.next;
      }
      
      if (carry > 0){
          curr.next = new Node(carry);
      }
      
      return dummyHead.next;
    
    }
  }
  