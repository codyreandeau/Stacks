public class Main {
  
  public static void main(String[] args) {
    
    LinkedStack list = new LinkedStack();
    
    list.push(5);
    list.push(4);
    list.push(7);
    list.push(8);
    list.push(2);
    list.push(1);
    
    while(!list.isEmpty()) {
      System.out.print(list.pop() + " ");
    }
  }
}