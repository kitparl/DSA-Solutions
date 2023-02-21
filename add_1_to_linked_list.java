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
    public Node addOneToLinkedList(Node head){
                      Node node = new Node(0);
          node.next = head;
          Node previous = null;
          Node current = node;
          Node next = null;
          while (current != null) {
              next = current.next;
              current.next = previous;
              previous = current;
              current = next;
          }
          node = previous;
  
          Node cur = node;
          int carry = 0;
          
          while (cur != null) {
              if (cur.data + 1 > 9) {
                  carry = 1;
                  if (carry == 1) {
                      cur.data = 0;
                      cur = cur.next;
                      carry = 0;
                  }
              } else {
                  cur.data = cur.data + 1;
                  break;
              }
          }
  
          previous = null;
          current = node;
          next = null;
          while (current != null) {
              next = current.next;
              current.next = previous;
              previous = current;
              current = next;
          }
          node = previous;
  
          if (node.data == 0) {
              return node.next;
          } else {
              return node;
          }
      }
  }
  