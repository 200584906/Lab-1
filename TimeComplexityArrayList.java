import java.util.ArrayList;

public class TimeComplexityArrayList {
    public static void main(String[] args) {
        int[] sizes = { 1000, 10000, 100000, 1000000 };
        for (int size : sizes) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            // Populate the ArrayList with integers from 0 to size-1
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            System.out.println("Size: " + size);

            // Measure time for accessing each element by index
            long startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.get(i);
            }
            long endTime = System.nanoTime();
            System.out.println("Access by Index: " + (endTime - startTime) + " ns");

            // Measure time for checking if each value exists in the list
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.contains(i);
            }
            endTime = System.nanoTime();
            System.out.println("Check Existence by Value: " + (endTime - startTime) + " ns");

            // Measure time for searching for the last element
            startTime = System.nanoTime();
            arrayList.contains(size - 1);  // Searching for the last element
            endTime = System.nanoTime();
            long searchDuration = endTime - startTime;
            System.out.println("Search for Last Element: " + searchDuration + " ns");

            // Measure time for inserting elements at the head of the list
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.add(0, i);
            }
            endTime = System.nanoTime();
            System.out.println("Insert at Head: " + (endTime - startTime) + " ns");

            // Measure time for inserting elements in the middle of the list
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.add(size / 2, i);
            }
            endTime = System.nanoTime();
            System.out.println("Insert in Middle: " + (endTime - startTime) + " ns");

            // Measure time for appending elements to the tail of the list
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
            endTime = System.nanoTime();
            System.out.println("Append at Tail: " + (endTime - startTime) + " ns");

            // Measure time for removing elements from the head of the list
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.remove(0);
            }
            endTime = System.nanoTime();
            System.out.println("Remove from Head: " + (endTime - startTime) + " ns");

            // Measure time for removing elements from the middle of the list
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.remove(size / 2);
            }
            endTime = System.nanoTime();
            System.out.println("Remove from Middle: " + (endTime - startTime) + " ns");

            // Measure time for removing elements from the tail of the list
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.remove(arrayList.size() - 1);
            }
            endTime = System.nanoTime();
            System.out.println("Remove from Tail: " + (endTime - startTime) + " ns");

            System.out.println();
        }
    }
}
