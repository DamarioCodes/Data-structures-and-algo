# Hashtables
## Quick Notes

A hashtable, also known as a hash map, is a data structure that allows efficient storage and retrieval of key-value pairs. It is commonly used to implement associative arrays or dictionaries. The main idea behind a hashtable is to use a hash function to compute an index, or hash code, for each key. This index is then used to directly access the corresponding value in an array, resulting in fast access times.

Here's a simplified description of how hashtables work:

1. Hash Function: A hash function takes a key as input and computes a unique hash code. This code is typically an integer that represents the index in the underlying array where the value will be stored.

2. Array Storage: Hashtables use an array as the underlying storage structure. Each element of the array is often called a "bucket" or a "slot." The array size is typically determined based on the expected number of key-value pairs to be stored.

3. Insertion: When inserting a new key-value pair into a hashtable, the hash function is applied to the key to determine the index where the value will be stored. If another value already exists at that index (a collision), the hashtable employs a collision resolution strategy to handle it.

4. Collision Resolution: There are various approaches to handle collisions, but the two most common ones are chaining and open addressing. 
   - Chaining: Each slot of the array contains a linked list or other data structure to handle multiple values that map to the same index.
   - Open Addressing: If a collision occurs, the hashtable searches for the next available slot in the array, usually by applying an offset to the original index. This process continues until an empty slot is found.

5. Retrieval: To retrieve a value, the hash function is applied to the key, and the resulting index is used to access the corresponding bucket. If chaining is used, a search is performed within the linked list or data structure to find the specific value associated with the key.

Hashtables provide efficient average-case time complexity for insertion, retrieval, and deletion operations, often achieving constant time complexity (O(1)). However, in the worst-case scenario, where many collisions occur, the performance can degrade to linear time complexity (O(n)), where n is the number of key-value pairs stored in the hashtable.

Overall, hashtables offer a balance between efficient data storage and retrieval, making them valuable in a wide range of applications where fast lookup is essential.
