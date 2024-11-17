import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Product{
    private final String name;
    private final int cost;
    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}

public class StoreSales {

    private final ArrayList<Product> salesList = new ArrayList<>();
    private int totalCost;
    private final ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

    public void sale(String name, int cost) {
        Product prod = new Product(name, cost);
        totalCost += prod.getCost();
        salesList.add(prod);
        if (map.containsKey(prod.getName())) {
            map.put(prod.getName(), map.get(prod.getName()) + 1);
        } else {
            map.put(prod.getName(), 1);
        }
    }

    public void getSalesList(){
        for (Product prod : salesList) {
            System.out.println(prod.getName());
        }
    }

    public void getMap(){
        for (Map.Entry<String, Integer> prod : map.entrySet()) {
            System.out.println("Товар " + prod.getKey() + " количеством " + prod.getValue());
        }
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void popularProd() {
        int maxCount = 0;
        String maxProd = "";
        for (Map.Entry<String, Integer> prod : map.entrySet()) {
            if (prod.getValue() > maxCount) {
                maxCount = prod.getValue();
                maxProd = prod.getKey();
            }
        }
        System.out.println("Самый популярный товар: " + maxProd + ", проданный " + maxCount + " раз");
    }
}
