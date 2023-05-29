/**
 * @author Damario Hamilton
 * main class that does simple test on the stack class
 * to ensure it follow the rules of the data structure
 */
public class Main {
    public static void main(String[] args) {
        myLLStack<Integer> stack = new myLLStack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        

        // Displaying the stack
        stack.displayStack();

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Getting the size of the stack
        System.out.println("Stack size: " + stack.size());

        // Peeking at the top of the stack
        System.out.println("Top of the stack: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped item: " + stack.pop());
        System.out.println("Popped item: " + stack.pop());

        // Displaying the updated stack
        stack.displayStack();

        // Checking if the stack is empty again
        System.out.println("Is stack empty? " + stack.isEmpty());

        // pushing elements to the stack
        stack.push(40);
        stack.push(50);
        stack.push(60);

        // displaying the stack
        stack.displayStack();

        // reverse the stack
        stack.reverseStack();

        // Displaying the reversed stack
        stack.displayStack();

      
    }
}