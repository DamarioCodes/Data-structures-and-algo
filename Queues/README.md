# Queues
## Quick Notes

 A queue is a linear data structure in computer science that follows a particular order of operations called First-In-First-Out (FIFO). It is named "queue" because it resembles a real-life queue or line, where the first person to join is the first one to be served.

The queue operates with two primary operations:

1. Enqueue: This operation adds an element to the end of the queue. The newly added element becomes the last one in the queue, and the size of the queue increases.

2. Dequeue: This operation removes the element at the front of the queue. The element that has been in the queue for the longest time is the first one to be removed, and the size of the queue decreases.

In addition to these basic operations, there are a few other common operations associated with queues:

3. Front: This operation retrieves the element at the front of the queue without removing it.

4. IsEmpty: This operation checks if the queue is empty and returns a boolean value indicating whether the queue contains any elements or not.

Queues are commonly implemented using arrays or linked lists. When using an array, a fixed-size array can be used, or a dynamic array implementation can allow the queue to grow or shrink as needed. In the case of linked list implementation, each node in the linked list represents an element in the queue, and the front and rear of the queue are represented by the head and tail of the list, respectively.

Queues are used in various applications, such as process scheduling in operating systems, message queues, breadth-first search algorithms, printer spooling, and handling requests in network communication, among others.
