public class Stack {
  
  private int[] array;
  private int stackSize;
  private int topOfStack;
  
  Stack(int size) {
    this.stackSize = size;
    this.topOfStack = 0;
    this.array = new int[size];
    }
  
  public boolean isEmpty() {
    return this.topOfStack == 0;
  }
  
  public void push(int x){
    
    array[topOfStack] = x;
    topOfStack++;
    stackSize++;
}
  
  public int pop(){
    
    topOfStack--;
    return array[topOfStack];
    
  }
}