public class Shop extends Institution{

    public Shop(double area, String address, String schedule) {
        super(area, address, schedule);
    }
    public Shop() {
        super();
    }
    public Shop(double area, String address) {
        super(area, address);
    }

    private int security;
    private boolean selfServiceCheckout;
    private String ambassador;

    public void setSecurity(int security) {
        this.security = security;
    }
    public int getSecurity() {
        return security;
    }

    public void setSelfServiceCheckout(boolean selfServiceCheckout) {
        this.selfServiceCheckout = selfServiceCheckout;
    }
    public boolean isSelfServiceCheckout() {
        return selfServiceCheckout;
    }

    public void setAmbassador(String ambassador) {
        this.ambassador = ambassador;
    }
    public String getAmbassador() {
        return ambassador;
    }

    public void director() {
        System.out.println("Директор магазина: Александров Тимофей");
    }

    public void receiptInfo(boolean receipt) {
        if (receipt) {
            System.out.println("Товары поступили");
        }
        else {
            System.out.println("Новых поступений нет");
        }
    }

    public void employeeOfTheMonth(String name) {
        System.out.println("Работник месяца: " + name);
    }
}
