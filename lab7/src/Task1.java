import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task1{
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 1; i < 21; i++) {
            array[i - 1] = i;
        }
        ExecutorService executor = Executors.newFixedThreadPool(4);
        ArrayList<Future<Integer>> results = new ArrayList<>();
        int count = 5;
        for (int i = 0; i < 4; i++) {
            int start = count * i;
            int finish = Math.min(start + count, array.length);
            results.add(executor.submit(() -> {
                int sum = 0;
                for (int j = start; j < finish; j++) {
                    sum += array[j];
                }
                return sum;
            }));
        }
        int total = 0;
        for (Future<Integer> res: results) {
            try {
                total += res.get();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        executor.shutdown();
        System.out.println(total);
    }
}