public class ArrayAverage {
    public static void main(String[] args) {
        Object [] numArray = new Object[] {1, 2, 3, 4, 5};
//        Object [] numArray = new Object[] {1., 2., 3., 4., 5.};
//        Object [] numArray = new Object[] {"one", "two", "three"};
        double s = 0;
        try {
            for (int i = 0; i <= numArray.length; i++) {
                s += ((Number) numArray[i]).doubleValue();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            s = 0;
            for (int i = 0; i < numArray.length; i++) {
                s += ((Number) numArray[i]).doubleValue();
            }
            System.err.println("Вышли за массив");
        } catch (ClassCastException e) {
            System.err.println("Передан неверный тип данных!");
        } finally {
            System.out.println("Среднее значение = " + s / numArray.length);
        }
    }
}
