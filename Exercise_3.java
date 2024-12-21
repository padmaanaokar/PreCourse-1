import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
   static Node head; // head of list 
   static Node curr;
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
        
        int data; 
        Node next;   
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
            this.data = d;
            this.next = null;
        } 
    } 
    public LinkedList(){
        this.head = null;// MIS: wrote head = new Node(d), it should be null
        this.curr = head;
    }


    
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head  == null){ // Mis : wrote head == null instead of list.head
            list.head  = newNode;
            list.curr = newNode;//Forgot to assign newNode to curr
        }else{
            // Else traverse till the last node 
            // and insert the new_node there 
                while(curr.next!= null){
                    curr = curr.next;
                }
                // Insert the new_node at last node 
                curr.next = newNode;
                curr = newNode;
        }           
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {      Node tmp = head;
            // Traverse through the LinkedList 
            while(tmp != null){
                // Print the data at current node
                System.out.println("Data at current node " +tmp.data);
                // Go to next node 
                tmp = tmp.next;
            }             
    } 
}
    class Main { 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = LinkedList.insert(list, 1); 
        list = LinkedList.insert(list, 2); 
        list = LinkedList.insert(list, 3); 
        list = LinkedList.insert(list, 4); 
        list = LinkedList.insert(list, 5); 
  
        // Print the LinkedList 
        LinkedList.printList(list); 
    } 
}