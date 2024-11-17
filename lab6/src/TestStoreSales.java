public class TestStoreSales {
    public static void main(String[] args) {
        StoreSales store = new StoreSales();
        store.sale("Zip hoodie Kreuzes", 6600);
        store.sale("Jeans Flare", 9000);
        store.sale("winter wax bomber", 13000);
        store.sale("Ushanka black", 2700);
        store.sale("Zip hoodie Kreuzes", 6600);

        store.getSalesList();
        store.getMap();
        System.out.println(store.getTotalCost());
        store.popularProd();
    }
}
