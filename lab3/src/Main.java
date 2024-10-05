import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> table = new HashTable<>();
        table.put("Рома", 52);
        System.out.println(table.size());
        System.out.println(table.get("Рома"));
        table.put("Рома", 19);
        System.out.println(table.get("Рома"));
        System.out.println(table.size());
        table.remove("Рома");
        System.out.println(table.size());
        System.out.println(table.get("Рома"));
        table.put("Максим", 19);
        table.put("Тимоха", 23);
        table.put("Данек", 64);
        table.put("Матвей", 13);
        System.out.println("До расширения хэш-таблицы");
        System.out.println(table.getIndex("Максим"));
        System.out.println(table.getIndex("Тимоха"));
        System.out.println(table.getIndex("Рома"));
        System.out.println(table.getIndex("Матвей"));
        System.out.println(table.getIndex("Данек"));
        table.put("Андрюша", 3);
        System.out.println("После расширения хэш-таблицы");
        System.out.println(table.getIndex("Максим"));
        System.out.println(table.getIndex("Тимоха"));
        System.out.println(table.getIndex("Рома"));
        System.out.println(table.getIndex("Матвей"));
        System.out.println(table.getIndex("Данек"));

        Employee emp1 = new Employee("Матвей", "Backend", 220000);
        Employee emp2 = new Employee("Тимофей", "Java разработчик", 272000);
        Employee emp3 = new Employee("Данила", "Дизайнер", 230000);
        Employee emp4 = new Employee("Максим", "Deep Learning", 300000);
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
        employeeTable.put(1, emp1);
        employeeTable.put(2, emp2);
        employeeTable.put(3, emp3);
        employeeTable.put(4, emp4);
        System.out.println(employeeTable.containsKey(3));
        System.out.println(employeeTable.containsKey(5));
        System.out.println(employeeTable.get(2).title);
        System.out.println(employeeTable.get(1).name);
        System.out.println(employeeTable.get(4).salary);
        employeeTable.remove(1);
        System.out.println(employeeTable.containsKey(1));
    }
}
