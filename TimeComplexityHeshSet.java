import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class TimeComplexityHeshSet{
    public static void main(String[] args) {
        int[] sizes = { 1000, 10000, 100000, 1000000 };
        for (int size : sizes) {
            Set<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Read by Index (convert to List first)
            List<Integer> list = new ArrayList<>(hashSet);
            long startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                int value = list.get(i); // Simulate read by index
            }
            long endTime = System.nanoTime();
            System.out.println("Read by Index for size " + size + ": " + (endTime - startTime) + " ns");

            // Read by Value
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                hashSet.contains(i);
            }
            endTime = System.nanoTime();
            System.out.println("Read by Value for size " + size + ": " + (endTime - startTime) + " ns");

            // Insert in Head 
            startTime = System.nanoTime();
            hashSet.add(size);
            endTime = System.nanoTime();
            System.out.println("Insert in Head for size " + size + ": " + (endTime - startTime) + " ns");

            // Insert in Mid 
            startTime = System.nanoTime();
            hashSet.add(size);
            endTime = System.nanoTime();
            System.out.println("Insert in Mid for size " + size + ": " + (endTime - startTime) + " ns");

            // Insert in the Tail
            startTime = System.nanoTime();
            hashSet.add(size);
            endTime = System.nanoTime();
            System.out.println("Insert in the Tail for size " + size + ": " + (endTime - startTime) + " ns");

            // Delete from Head
            startTime = System.nanoTime();
            hashSet.add(size);
            endTime = System.nanoTime();
            System.out.println("Delete from Head for size " + size +": " + (endTime - startTime) + " ns");

            // Delete from Mid 
            startTime = System.nanoTime();
            hashSet.add(size);
            endTime = System.nanoTime();
            System.out.println("Delete from Mid for size " + size + ": " + (endTime - startTime) + " ns");

            // Delete from Tail
            startTime = System.nanoTime();
            hashSet.remove(size);
            endTime = System.nanoTime();
            System.out.println("Delete from Tail for size " + size + ": " + (endTime - startTime) + " ns");
        }
    }
}
