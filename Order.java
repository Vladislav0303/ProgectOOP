import java.util.Arrays;

public class Order extends Basket{
    private int numOfOrder;
    private String databaseOfOrders = "databaseOfOrders.txt";

    public Order() {

    }
    public void order(String[] NameProducts, int[] countOfProduct, int cost) {
          int num = numOfOrder++;
          System.out.println(num);
        databaseOfOrders = "Номер замовлення: " + numOfOrder;
        System.out.println("Номер замовлення: " + numOfOrder);
        System.out.println("Список замовлення: " + Arrays.toString(NameProducts));;
        System.out.println("Ціна за всі товари: " + cost);
        Pay pay = new Pay();
        pay.pay();
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
