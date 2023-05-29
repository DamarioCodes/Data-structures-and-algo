/**
 * @author Damario Hamilton
 * Stack implementation done using linked List
 * all method follow the necessary run-time needed for 
 * a standard stack data structure
 */
import java.util.EmptyStackException;

public class myLLStack<T> {
   // private class which maintain encapsulation
    private class Node{
        T item;
        Node next;  
        
        Node ( T data){
            this.item = data;
            this.next = null;
        }

    }

    private Node topStack;
    private int stackSize;

    // costructor for stack 
    public myLLStack(){
        this.topStack = null;
        stackSize = 0;
    }

    // push an item onto the top of the stack
    // done in O(1) time
    public boolean push(T item){
        Node newNode = new Node(item);
        newNode.next = this.topStack;
        topStack = newNode;
        stackSize ++;
        return true ;
    }

    // remove an item from the top of the stack
    // done in O(1) time
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        T popItem = topStack.item;
        this.topStack = topStack.next;
        stackSize --;
        return popItem;
    }

    //check if the stack is empty
    // done in O(1) time
    public boolean  isEmpty(){
        if(topStack == null)
            return true;
        return false;

    }

    // print the stack as it is
    // done in O(N) time
    public void displayStack(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Node current;
        current = topStack;
        System.out.println("top of the stack");
        while (current != null ){
            System.out.println(current.item);
            current = current.next;
        }
        System.out.println("bottom of the stack");
    }

    // gives what is at the top of the stack
    // done in O(1) time
    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return topStack.item;
    }

    // gives the size of the stack
    // done in O(1) time
    public int size(){
        if(isEmpty()){
            return 0;
        }
        return this.stackSize;
    }

    // reverses the order of the stack
    // done in O(N) time.
    public void  reverseStack(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        if (stackSize == 1){
            return;
        }
        Node current = topStack;
        myLLStack<T> reverseStack = new myLLStack<>();
        while( current != null ){
           reverseStack.push(this.pop());
           current = current.next;
        }
        // copy the reversed stack to the orginal stack
        this.topStack = reverseStack.topStack;
        this.stackSize = reverseStack.stackSize;

    }



}