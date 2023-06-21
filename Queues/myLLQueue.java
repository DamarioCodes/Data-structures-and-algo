public class myLLQueue<T>{
    private MyLinkedList<T> list;

    public myLLQueue(){
        list = new MyLinkedList<>();
    }

    public void enqueue(T item){
        Node<T> node = new Node<>(item);
        list.insertBack(node);

    }

    public T dequeue(){
        return list.removeFront();
    }

    public T peek(){
        Node<T> headNode = list.getHeadNode();
        if (headNode != null) {
            return headNode.getData();
        }
        return null;
    }

    public int size() {
        Node<T> current = list.getHeadNode();
        int count = 0;
        while (current != null) {
            count++;
            current = current.getNextNode();
        }
        return count;
    }

    public boolean isEmpty() {
        return list.getHeadNode() == null;
    }

    public static void main(String[] args) {
    
    }
    
}
