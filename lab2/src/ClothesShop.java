public class ClothesShop extends Shop{

    public ClothesShop(double area, String address, String schedule) {
        super(area, address, schedule);
    }
    public ClothesShop() {
        super();
    }
    public ClothesShop(double area, String address) {
        super(area, address);
    }

    private String style;
    private String sales;
    private int consultants;

    public void setStyle(String style) {
        this.style = style;
    }
    public String getStyle() {
        return style;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }
    public String getSales() {
        return sales;
    }

    public void setConsultants(int consultants) {
        this.consultants = consultants;
    }
    public int getConsultants() {
        return consultants;
    }

    public void director() {
        System.out.println("Директор магазина одежды: Девайкин Игорь");
    }

    public void ambassadorClothes() {
        System.out.println("Появилась линейка одежды от " + getAmbassador());
    }

    public int totalSalary(int salary) {
        return salary * consultants;
    }
}
