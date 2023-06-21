public class Main {
    public static void main(String[] args) {
        myLLQueue<Integer> queue = new myLLQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Size: " + queue.size());     // Output: Size: 3
        System.out.println("IsEmpty: " + queue.isEmpty());// Output: IsEmpty: false
        System.out.println("Peek: " + queue.peek());      // Output: Peek: 10

        System.out.println("Dequeue: " + queue.dequeue());// Output: Dequeue: 10
        System.out.println("Dequeue: " + queue.dequeue());// Output: Dequeue: 20

        System.out.println("Size: " + queue.size());     // Output: Size: 1
        System.out.println("IsEmpty: " + queue.isEmpty());// Output: IsEmpty: false
        System.out.println("Peek: " + queue.peek());      // Output: Peek: 30

        queue.dequeue();
        System.out.println("IsEmpty: " + queue.isEmpty());// Output: IsEmpty: true
        System.out.println("Peek: " + queue.peek());      // Output: Peek: null
    }
}
