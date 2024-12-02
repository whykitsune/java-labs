import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ArrayList<Integer> items = new ArrayList<>();
        items.add(10);
        items.add(40);
        items.add(20);
        items.add(100);
        items.add(50);
        items.add(30);
        new Work(countDownLatch, "Вася", items);
        new Work(countDownLatch, "Петя", items);
        new Work(countDownLatch, "Коля", items);

        countDownLatch.await();
        System.out.println("Работа выполнена");
        System.out.println(Work.getCurWeight());
    }
}

class Work extends Thread {
    static int curWeight = 0;
    static int curIndex = 0;
    ArrayList<Integer> items;
    CountDownLatch countDownLatch;
    String name;
    public Work(CountDownLatch countDownLatch, String name, ArrayList<Integer> items) {
        this.countDownLatch = countDownLatch;
        this.name = name;
        this.items = items;
        start();
    }
    @Override
    public void run() {
        while (true) {
            if (curWeight < 150) {
                int weight = items.get(curIndex);
                if (curWeight + weight <= 150) {
                    curWeight += weight;
                    items.remove(curIndex);
                    System.out.println(name + " взял товар весом " + weight + ". Общий вес " + curWeight);
                } else {
                    curIndex++;
                }
            } else {
                System.out.println(name + " закончил работу");
                countDownLatch.countDown();
                break;
            }
        }
    }

    public static int getCurWeight() {
        return curWeight;
    }
}