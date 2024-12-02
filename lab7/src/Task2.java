import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task2{
    public static void main(String[] args) {
        int[][] array = new int[][] {
                {1, 2, 3, 4, 5},
                {6, 7, 8},
                {9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18},
                {19, 20}
        };
        ExecutorService executor = Executors.newFixedThreadPool(array.length);
        ArrayList<Future<Integer>> results = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int[] line = array[i];
            results.add(executor.submit(() -> {
                int max = line[0];
                for (int j = 1; j < line.length; j++) {
                    max = Math.max(max, line[j]);
                }
                return max;
            }));
        }
        int total = array[0][0];
        for (Future<Integer> res: results) {
            try {
                total = Math.max(total, res.get());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        executor.shutdown();
        System.out.println(total);
    }
}