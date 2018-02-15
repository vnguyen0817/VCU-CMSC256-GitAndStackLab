public class ArrayBasedStack <T> implements StackInterface <T>{
      
   private T[] data;
   //(T[]) new Object[length]; 
   private int topOfStack;
   private int INITIAL_CAPACITY = 5; 
   private boolean initialized = true;   
   
   public ArrayBasedStack(int length){
      data = (T[]) new Object[length];
      topOfStack = -1;
      if(topOfStack < 0){
         throw new IllegalArgumentException("Please input a value above 0");
      }
   }
   
   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry){
      
   }
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop(){
      return null;
   }
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek(){
      return null;
   }
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty(){
      return true;
   }
  
   /** Removes all entries from this stack. */
   public void clear(){
   
   }

}