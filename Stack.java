import java.util.*;

public class Stack {
  
  private int[] array;
  private int arraySize;
  private int topOfStack;
  private int itemsInStack;
  
  Stack(int size) {
    this.arraySize = size;
    this.topOfStack = 0;
    this.array = new int[arraySize];
    }
  
  public boolean isEmpty() {
    return this.topOfStack == 0;
  }
  
  public void push(int x){
    
    if (topOfStack == array.length){
      throw new StackOverflowError();
    }else{
    array[topOfStack] = x;
    topOfStack++;
    itemsInStack++;
    }
}
  
  public int pop(){
    
    if(isEmpty()) {
      throw new EmptyStackException();
    }else{
    topOfStack--;
    itemsInStack--;
    return array[topOfStack];
    }
  }
  
  public int peek() {
    if(isEmpty()) {
      throw new EmptyStackException();
    } else {
    return array[topOfStack - 1];
    }
  }
  
  public int size() {
    return itemsInStack;
  }
}