public class Library extends Institution{

    public Library(double area, String address, String schedule) {
        super(area, address, schedule);
    }
    public Library() {
        super();
    }
    public Library(double area, String address) {
        super(area, address);
    }

    private int booksCount;
    private int entryCost;
    private boolean loyaltySystem;

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }
    public int getBooksCount() {
        return booksCount;
    }

    public void setEntryCost(int entryCost) {
        this.entryCost = entryCost;
    }
    public int getEntryCost() {
        return entryCost;
    }

    public void setLoyaltySystem(boolean loyaltySystem) {
        this.loyaltySystem = loyaltySystem;
    }
    public boolean isLoyaltySystem() {
        return loyaltySystem;
    }

    public void director() {
        System.out.println("Директор библиотеки: Антипин Егор");
    }

    public void writingOffBooks(int countBooksOff) {
        booksCount = booksCount - countBooksOff;
        System.out.println("Было списано " + countBooksOff + " книг");
    }

    public int price() {
        if (loyaltySystem) {
            return (int) (0.9 * entryCost);
        }
        else {
            return entryCost;
        }
    }
}
