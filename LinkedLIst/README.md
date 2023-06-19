# Linked List

## Quick notes

A linked list is a data structure used in computer programming to organize and store data elements. It consists of a sequence of nodes, where each node contains both data and a reference or pointer to the next node in the list.

Unlike arrays, which store elements in contiguous memory locations, linked lists allow dynamic memory allocation as the nodes can be scattered throughout the memory. Each node in a linked list contains two main components:

Data: This component holds the actual value or data element associated with the node.

Next pointer: This component is a reference or pointer that points to the next node in the list. It establishes the connection between nodes and enables traversal from one node to another.

The first node in the linked list is called the head, and the last node points to null or has a null reference, indicating the end of the list. This allows for efficient insertion and deletion of nodes anywhere in the list by simply updating the pointers.

Linked lists come in various forms, such as singly linked lists (where each node points to the next node), doubly linked lists (where each node has pointers to both the next and previous nodes), and circular linked lists (where the last node points back to the head, creating a loop).

Linked lists provide flexibility in dynamically managing data and are commonly used in scenarios where the number of elements can change frequently, or when efficient insertion and deletion operations are required. However, accessing elements in a linked list can be slower compared to arrays since sequential traversal is necessary to reach a specific element.
