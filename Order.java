import java.util.Arrays;

public class Order {
    private int numOfOrder;
    private String databaseOfOrders = "databaseOfOrders.txt";

    public Order() {

    }
    void order(String[] NameProducts, int[] countOfProduct, int[] cost) {
        Site s = new Site();
          int num = numOfOrder++;
          System.out.println(num);
        databaseOfOrders = "Номер замовлення: " + numOfOrder;
        System.out.println("Номер замовлення: " + numOfOrder);
        System.out.println("Список замовлення: " + Arrays.toString(NameProducts));
        System.out.println("Товари: " + Arrays.toString(cost));
        Pay pay = new Pay();
    }

    public String getDatabaseOfOrders() {
        return databaseOfOrders;
    }

    public void setDatabaseOfOrders(String databaseOfOrders) {
        this.databaseOfOrders = databaseOfOrders;
    }

    public int getNumOfOrder() {
        return numOfOrder;
    }

    public void setNumOfOrder(int numOfOrder) {
        this.numOfOrder = numOfOrder;
    }
}
