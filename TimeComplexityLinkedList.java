import java.util.LinkedList;

public class TimeComplexityLinkedList {
    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Populate the LinkedList with integers from 0 to size-1
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for reading the element at the middle index
            long startTime = System.nanoTime();
            linkedList.get(size / 2);  // Accessing the middle element
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Time taken for reading by index in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for searching for the middle value
            startTime = System.nanoTime();
            linkedList.contains(size / 2);  // Searching for the middle value
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for searching by value in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for inserting an element at the head of the list
            startTime = System.nanoTime();
            linkedList.add(0, -1);  // Inserting at the head
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for inserting at head in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for inserting an element in the middle of the list
            startTime = System.nanoTime();
            linkedList.add(size / 2, -1);  // Inserting in the middle
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for inserting at middle in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for inserting an element at the tail of the list
            startTime = System.nanoTime();
            linkedList.add(-1);  // Inserting at the tail
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for inserting at tail in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for deleting the head element
            startTime = System.nanoTime();
            linkedList.remove(0);  // Removing from the head
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for deleting from head in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for deleting the middle element
            startTime = System.nanoTime();
            linkedList.remove(size / 2);  // Removing from the middle
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for deleting from middle in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for deleting the tail element
            startTime = System.nanoTime();
            linkedList.remove(linkedList.size() - 1);  // Removing from the tail
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for deleting from tail in LinkedList of size " + size + ": " + duration + " nanoseconds");

            System.out.println("------------------------------------------------");
        }
    }
}
