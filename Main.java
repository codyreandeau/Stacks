public class Main{
  
  public static void main(String[] args) {
    
    Stack arrayStack = new Stack(8);
    
    arrayStack.push(1);
    arrayStack.push(5);
    arrayStack.push(6);
    arrayStack.push(9);
    
    while(!arrayStack.isEmpty()){
      System.out.print(arrayStack.pop() + " ");
    }
    
  }
}