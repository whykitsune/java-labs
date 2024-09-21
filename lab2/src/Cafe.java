public class Cafe extends Institution{

    public Cafe(double area, String address, String schedule) {
        super(area, address, schedule);
    }
    public Cafe() {
        super();
    }
    public Cafe(double area, String address) {
        super(area, address);
    }

    private int tables;
    private int averageBill;
    private String cuisine;

    public void setTables(int tables) {
        this.tables = tables;
    }
    public int getTables() {
        return tables;
    }

    public void setAverageBill(int averageBill) {
        this.averageBill = averageBill;
    }
    public int getAverageBill() {
        return averageBill;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
    public String getCuisine() {
        return cuisine;
    }

    public void director() {
        System.out.println("Директор кафе: Юсуфджон");
    }

    public void bookTable(int table) {
        System.out.println("Столик №" + table + " забронирован.");
    }

    public double ratio(int dayAverageBill) {
        return (double) dayAverageBill / averageBill;
    }
}
