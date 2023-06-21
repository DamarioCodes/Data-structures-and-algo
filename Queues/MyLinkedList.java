/**
 * @author Damario Hamilton
 * Linked LIst data structure with  basic and added functionnality
 * this implementation keeps track of the head and tail of the LL
 */
public class MyLinkedList<T> {
    private Node<T> head;
    public Node<T> tail;

    // constructor for LinkedLIst 
    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public Node<T>  getTailNode(){
        return this.tail;
    }

    public Node<T> getHeadNode(){
        return this.head;
    }
    // InsertFront puts the inserted node to the front of the LL    
    public void insertFront(Node<T> node){
        if ( head == null &&  tail == null){
            this.head = node;
            this.tail = node;
        }
        else {
            node.setNextNode(head);
            this.head = node;    
        }
    }

    // InsertBack put the inserted node to the back of LL
    public void insertBack(Node<T> node){
        if ( head == null &&  tail == null){
            this.head = node;
            this.tail = node;
        }
        else {
            tail.setNextNode(node);
            this.tail = node;    
        }

    }

    // displays all the nodes currently in the LL
    public void display(){
        Node<T> current = head;
        while( current != null ){
            System.out.print(current.getData() + " --> ");
            current = current.getNextNode();
        }
        System.out.print("null \n");

    }

    // removes the node at the front of the list
    public T removeFront(){
        if (head == null)
            return null;
        Node<T> current = head;
        head = current.getNextNode();
        if (head == null)
            tail = null;
        return  current.getData();
    }

    // removes the nodes from the back of the list
    public T removeBack(){
        if (tail == null)
            return null;
        Node<T> removeNode = tail;
        Node<T> current = head;
        while( current.getNextNode() != removeNode && current != null){
            current = current.getNextNode();
        }
        current.setNextNode(null);
        tail = current;
        if (tail == null )
            head = null;
        T returnValue = removeNode.getData();
        return returnValue;
    }

    // Searches if a nodes is in the list and removes it
    public void removeNode(Node<T> node){
        if (head == null){
            System.out.println("Node is empty");
            return;
        }
        if ( node == head ){
            removeFront();
            return;
        }
        if ( node == tail){
            removeBack();
            return;
        }

        Node<T> current = head;
        while (current.getNextNode() != null && current.getNextNode().getData() != node.getData()){ 
            current = current.getNextNode();  
        }
        if (current.getNextNode() ==  null){
            System.out.println("Node is not in the List");
            return;   
        }
        current.setNextNode(current.getNextNode().getNextNode());
    }

    public void reverseLL(){
        Node<T>  previous = null;
        Node<T> current = head;
        Node<T> next;
        tail = head;
        while(current != null){
            next = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current = next;
        }
        head = previous;   
    }

}
