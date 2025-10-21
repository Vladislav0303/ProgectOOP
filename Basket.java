import java.util.Arrays;

public class Basket extends Product {
    public String[] NameProduct = new String[10];
    public int[] countOfProduct = new int[100];
    protected int[] cost;

    public Basket() {

    }
    void basket() {
        for (int i = 0; i < NameProduct.length; i++) {
        NameProduct[i] = getNameProduct();
        countOfProduct[i] = getCountOfProduct();
        cost[i] = getCost();
        }
        System.out.println(Arrays.toString(NameProduct) + " " + Arrays.toString(countOfProduct));
//        якщо користувач готовий до сплати
        Order order = new Order();
        order.order(NameProduct, countOfProduct, cost);
    }
}

