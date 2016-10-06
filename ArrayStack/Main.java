public class Main{
  
  public static void main(String[] args) {
    
    ArrayStack arrayStack = new ArrayStack(6);
    
    arrayStack.push(1);
    arrayStack.push(5);
    arrayStack.push(6);
    arrayStack.push(9);
    arrayStack.push(3);
    arrayStack.push(7);
    
    System.out.println("There are " + arrayStack.size() + " items in the stack");
    System.out.println("The item on the top of the stack is: " + arrayStack.peek());
    
    System.out.print("The items in the list are: ");
    while(!arrayStack.isEmpty()){
      System.out.print(arrayStack.pop() + " ");
    }
    
    System.out.println();
    System.out.println("There are now " + arrayStack.size() + " items in the stack");
  }
}