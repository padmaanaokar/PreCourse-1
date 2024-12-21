class StackAsLinkedList { 
  
   // StackNode root; 
    private StackNode top;  // Reference to the top of the stack
    private int size;  // Tracks the size of the stack
    
    public StackAsLinkedList() {
        this.top = null; // Stack is initially empty
        this.size = 0;   // Size is initially zero
    }
    
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {   
            //Constructor here 
            this.next = null;
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
         if(top.next == null){
            return true;
         }else{
            return false;
         }
    } 
                                //        top
    public void push(int data) // O<-O<-O<-O
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data); 
        newNode.next = top; // assignning null to its next
        top = newNode;// similar to incrementing the top    
        size++;
        
    } 
                                //        top
                                // O<-O<-O<-O
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(this.size == 0){
        System.out.print("Stack Underflow");
        return 0;
    }else{
        int val = top.data;
        top = top.next; //       //      top prevTop(popped)
                                // O<-O<-O    O
        size--;
        return val;

    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.size == 0){
            System.out.print("Stack Underflow");
            return 0;
        }else{
            int val = top.data;
            return val;
        }

    } 
}
  class Main { 
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
