/**
 * @author Damario Hamilton
 * This main class aims to test the LL 
 *
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();

         // Creating a node to be removed
         Node<Integer> nodeToRemove = new Node<>(3);

        // Inserting nodes at the front
        
        myList.insertFront(nodeToRemove);
        
        myList.insertFront(new Node<>(2));
        myList.insertFront(new Node<>(1));

        // Inserting nodes at the back
        myList.insertBack(new Node<>(4));
        myList.insertBack(new Node<>(5));

        // Displaying the linked list
        System.out.println("Linked List:");
        myList.display();

        // Removing the node at the front
        Integer removedFront = myList.removeFront();
        System.out.println("Removed front node: " + removedFront);

        // Removing the node at the back
        Integer removedBack = myList.removeBack();
        System.out.println("Removed back node: " + removedBack);

        // Displaying the updated linked list
        System.out.println("Updated Linked List:");
        myList.display();

       

        // Removing a specific node
        myList.removeNode(nodeToRemove);

        // Displaying the updated linked list
        System.out.println("Updated Linked List after removing node:");
        myList.display();

        // removing all nodes then display
        myList.removeFront();
        myList.removeFront();
        System.out.println("Updated Linked List after removing all nodes:");
        myList.display();

        // Inserting nodes at the  the front then display
        myList.insertFront(new Node<>(3));
        myList.insertFront(new Node<>(2));
        myList.insertFront(new Node<>(1));

        // Inserting nodes at the back
        myList.insertBack(new Node<>(4));
        myList.insertBack(new Node<>(5));
 
        System.out.println("Adding the nodes back to the linked List");
        myList.display();

        // reversing the linked list 
        System.out.println("Updated Linked List after reversing the nodes :");
        myList.reverseLL();
        myList.display();
    }
}
