
public class Basket {
    String[] NameProduct = new String[10];
    int[] countOfProduct = new int[100];
    int[] cost;
    public Basket() {

    }
    public void basket(String Product, int countProduct, int costProduct) {
        for (int i = 0; i < NameProduct.length; i++) {
        NameProduct[i] = Product;
        countOfProduct[i] = countProduct;
        cost[i] = costProduct;
        while (cost[i] <= costProduct) {
            costProduct = costProduct + costProduct;
        }
        }
        System.out.println(Product + " " + countProduct);
//        якщо користувач готовий до сплати
        Order order = new Order();
        order.order(NameProduct, countOfProduct, cost);
    }
}

