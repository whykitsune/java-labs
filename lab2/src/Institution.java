public abstract class Institution {

    private double area;
    private String address;
    private String schedule;
    private static int countInstitution;

    public Institution() {
        countInstitution++;
    }
    public Institution(double area, String address, String schedule) {
        this.area = area;
        this.address = address;
        this.schedule = schedule;
        countInstitution++;
    }
    public Institution(double area, String address) {
        this.area = area;
        this.address = address;
        countInstitution++;
    }

    public void setArea(double area) {
        this.area = area;
        countInstitution++;
    }

    public double getArea() {
        return area;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void welcome(String guestName) {
        System.out.println("Добро пожаловать, " + guestName + "!");
    }

    public double rentCost(double cost) {
        return cost * area;
    }

    public abstract void director();

    public static int getCount() {
        return countInstitution;
    }
}
