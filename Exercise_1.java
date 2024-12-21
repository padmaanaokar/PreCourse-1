class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if( top == 0){
            return true;
        } else{
            return false;
        }

    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = 0;
        this.a = new int[MAX];

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(a.length > MAX){
            return false;
        }else{
            this.a[top] = x;
            top++;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == 0){
            System.out.print("Stack Underflow");
            return 0;
        }else{
            top = top - 1;
            int no = a[top];
            a[top] = 0;
            top = top + 1;
            return no;

        }
    } 
  
    int peek() 
    { 
        //Write your code here
         if(top == 0){
            return 0;
         }else{
            return a[top-1];
         }    

    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
