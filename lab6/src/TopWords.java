import java.io.*;
import java.util.*;

public class TopWords{
    public static void main(String[] args) {
        String filePath = "src/file.txt";
        File file = new File(filePath);
        HashMap<String, Integer> map = new HashMap<>();
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                word = word.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
                word = word.toLowerCase();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            scanner.close();
            ArrayList<Integer> list = new ArrayList<>(map.values());
            list.sort(Collections.reverseOrder());
            int limit = Math.min(list.size(), 10);
            for (int i = 0; i < limit; i++) {
                for (String key : map.keySet()) {
                    if (map.get(key).equals(list.get(i))) {
                        System.out.println(key + " встретилось " + map.get(key) + " раз");
                        map.remove(key);
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}