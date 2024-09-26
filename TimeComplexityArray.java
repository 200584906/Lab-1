import java.util.ArrayList;
import java.util.Random;

// Class to measure time complexity of ArrayList operations
public class TimeComplexityArray {

    // Function to measure the time taken for a given operation
    public static long measureTime(Runnable operation) {
        long startTime = System.nanoTime();
        operation.run();
        return System.nanoTime() - startTime;
    }

    public static void main(String[] args) {
        // Define various array sizes for testing
        int[] sizes = { 1000, 10000, 100000, 1000000 };

        // Random number generator for populating the array
        Random random = new Random();

        // Perform time measurements for each array size
        for (int size : sizes) {
            System.out.println("Array Size: " + size);
            ArrayList<Integer> array = new ArrayList<>(size);

            // Fill the array with random integer values
            for (int i = 0; i < size; i++) {
                array.add(random.nextInt());
            }

            // 1. Measure time for reading an element by index (middle index)
            long timeReadByIndex = measureTime(() -> {
                int value = array.get(size / 2); // Access the middle element
            });
            System.out.println("Read by Index: " + timeReadByIndex + " ns");

            // 2. Measure time for searching by value (middle value)
            long timeReadByValue = measureTime(() -> {
                boolean found = array.contains(array.get(size / 2)); // Check if middle element exists
            });
            System.out.println("Read by Value: " + timeReadByValue + " ns");

            // 3. Measure time for inserting an element at the start of the array
            long timeInsertHead = measureTime(() -> {
                array.add(0, random.nextInt()); // Insert element at index 0
            });
            System.out.println("Insert at Head: " + timeInsertHead + " ns");

            // 4. Measure time for inserting an element in the middle of the array
            long timeInsertMid = measureTime(() -> {
                array.add(size / 2, random.nextInt()); // Insert element at the middle index
            });
            System.out.println("Insert in Middle: " + timeInsertMid + " ns");

            // 5. Measure time for appending an element to the end of the array
            long timeInsertTail = measureTime(() -> {
                array.add(random.nextInt()); // Insert element at the last index
            });
            System.out.println("Insert at Tail: " + timeInsertTail + " ns");

            // 6. Measure time for deleting the first element of the array
            long timeDeleteHead = measureTime(() -> {
                array.remove(0); // Remove the element at index 0
            });
            System.out.println("Delete from Head: " + timeDeleteHead + " ns");

            // 7. Measure time for deleting an element from the middle of the array
            long timeDeleteMid = measureTime(() -> {
                array.remove(size / 2); // Remove the middle element
            });
            System.out.println("Delete from Middle: " + timeDeleteMid + " ns");

            // 8. Measure time for deleting the last element of the array
            long timeDeleteTail = measureTime(() -> {
                array.remove(array.size() - 1); // Remove the last element
            });
            System.out.println("Delete from Tail: " + timeDeleteTail + " ns");

            System.out.println("------------------------------------------------");
        }
    }
}
