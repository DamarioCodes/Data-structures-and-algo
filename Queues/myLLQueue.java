public class myLLQueue<T> {
    private MyLinkedList<T> list; // Internal MyLinkedList to store the queue elements

    public myLLQueue() {
        list = new MyLinkedList<>(); // Initialize the internal list
    }

    public void enqueue(T item) {
        Node<T> node = new Node<>(item); // Create a new node with the item
        list.insertBack(node); // Insert the node at the back of the list (enqueue)
    }

    public T dequeue() {
        return list.removeFront(); // Remove and return the element at the front of the list (dequeue)
    }

    public T peek() {
        Node<T> headNode = list.getHeadNode(); // Get the head node of the list
        if (headNode != null) {
            return headNode.getData(); // Return the data of the head node (front of the queue)
        }
        return null; // If the queue is empty, return null
    }

    public int size() {
        Node<T> current = list.getHeadNode(); // Start from the head node
        int count = 0; // Counter to track the number of elements
        while (current != null) { // Traverse the list until the end (tail node)
            count++; // Increment the counter for each element
            current = current.getNextNode(); // Move to the next node
        }
        return count; // Return the total count as the size of the queue
    }

    public boolean isEmpty() {
        return list.getHeadNode() == null; // Check if the head node is null, indicating an empty queue
    }
}
