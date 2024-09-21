public class Main {
    public static void main(String[] args) {
    Cafe vostochka = new Cafe(40, "Авиамоторная 8А", "ПН-СБ");
    vostochka.setTables(18);
    vostochka.setAverageBill(350);
    System.out.println(vostochka.getSchedule());
    vostochka.bookTable(6);

    Shop pyatorochka = new Shop(120, "Маршала Тухачевского 39");
    pyatorochka.setSelfServiceCheckout(true);
    pyatorochka.employeeOfTheMonth("Мельников Иван");

    Library library52 = new Library(150, "Куйбышева 74", "ПН-ВС");
    library52.setEntryCost(290);
    library52.setLoyaltySystem(true);
    System.out.println(library52.price());
    System.out.println(library52.getAddress());

    ClothesShop wwshop = new ClothesShop(200, "Шелепихинская наб. 34", "ПН-ВС");
    wwshop.setConsultants(17);
    wwshop.setAmbassador("Шептунов Максим");
    wwshop.director();
    wwshop.ambassadorClothes();

    System.out.println(Institution.getCount());;
    }
}