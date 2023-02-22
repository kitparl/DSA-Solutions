
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

class Solution{
    public static boolean detectPalindrome(Node a){
      //complete this function.
      if(a == null){
          return true;
      }
      Node w = a;
      Node pre = new Node(a.data);
      while(w.next != null){
          Node temp = new Node(w.next.data);
          temp.next = pre;
          pre = temp;
          w = w.next;
      }
      
      Node x1 = a;
      Node x2 = pre;
      
      while(x1 != null){
          if(x1.data != x2.data){
              return false;
          }
          x1 = x1.next;
          x2 = x2.next;
      }
      
      return true;
      
    }
  }