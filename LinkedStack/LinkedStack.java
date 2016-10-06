import java.util.*;

public class LinkedStack {
  
  private Node head;
  
  public void push(int x){
    
    Node newNode = new Node(x);
    
    if(isEmpty()){
    head = newNode;
    }else{
      newNode.setNext(head);
      head = newNode;
    }
  }
  
  public int pop() {
    
    if(isEmpty()){
      throw new EmptyStackException();
    }else{
      int popped = head.getData();
      head = head.getNext();
      return popped;
    }
  }
  
  public boolean isEmpty() {
    return head == null;
  }
}