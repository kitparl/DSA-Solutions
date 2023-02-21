/*
class Node{
	int data;
	Node next;

	Node(){
		this.data = 0;
		this.next = null;
	}
	Node(Node next,int data){
		this.data = data;
		this.next = next; 
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
*/

class Solution{
    public int middleNode(Node head){
       Node g = head;
          Node s = head;
          if (head != null) {
              while (g != null && g.next != null) {
                  g = g.next.next;
                  s = s.next;
              }
              return s.data;
          }
          return -1; 
      
    }
  }
  