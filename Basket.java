import java.util.Arrays;
import java.util.Scanner;

public class Basket extends Product {
    public String[] NameProduct = new String[10];
    public int[] countOfProduct = new int[100];
    protected int costofProduct;

    public Basket() {

    }
    public void basket() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість продуктів:");
        int count = sc.nextInt();
        for (int i = 0; i < NameProduct.length; i++) {
        NameProduct[i] = getNameProduct();
        countOfProduct[i] = getCountOfProduct();
            for (int j = 0; j <= count; j++) {
                cost = cost + cost;
            }
        costofProduct = cost;
            System.out.println(costofProduct);
        }
        System.out.println(Arrays.toString(NameProduct) + " " + Arrays.toString(countOfProduct));
        Order order = new Order();
        order.order(NameProduct, countOfProduct, costofProduct);
    }
}

