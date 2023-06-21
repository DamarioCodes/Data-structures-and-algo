/**
 * @author Damario Hamilton
 *  Node class that necessary procedure for the node
 */
public class Node<T>  {
     private T data; // this field stores generic value of the data to be stored 
     private Node<T> nextNode; // this field stores the nextNode in the LL
     
     
     // constructor class for the Node that sets the data and leaves
     // the next node as null
     public  Node(T data){
        this.data = data;
        this.nextNode = null;
     }

     // getter for the node data
     public T getData(){
        return this.data;
     }

     // setter for the node data
     public void setData(T data){
        this.data = data ;
     }

     // getter for the next Node in the LL
     public Node<T> getNextNode(){
        return this.nextNode;
     }

     // setter for the next Node int the LL
     public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
     }

 }
     
     
    

