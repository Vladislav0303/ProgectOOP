import java.io.*;
import java.util.Scanner;

public class Product {
    private String nameProduct;
    private int countOfProduct;
    private int cost;
    protected String characteristic;
    protected int rating;
    private String databaseProducts = "rtr.txt";
    Scanner sc = new Scanner(System.in);

    public Product() {

    }
    // якщо користувач захоче поставити оцінку
        void product() {
            try (BufferedReader br = new BufferedReader(new FileReader(databaseProducts))){
                String ln;
                while ((ln = br.readLine()) != null) {
                    System.out.println(ln);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Хочете додати свій коментар?: ");
            String chose = sc.nextLine();
            if(chose.equals("Так")) {
                Response rsp = new Response();
            }
            System.out.println("Ви вже вибрали що хочете купити?: ");
            String chose1 = sc.nextLine();
            if(chose1.equals("Так")) {
                Basket bs = new Basket();
//        bs.basket(nameProduct(ці змінні будуть мати значення), countOfProduct(ці також), cost);
            }
//      вивід продуктів на екран
        }
    void aboutOfProduct(String nameproduct, int costproduct, String character, int rating, int countproduct) {
        setNameProduct(nameproduct);
        setCost(costproduct);
        setCharacteristic(character);
        setRating(rating);
        setCountOfProduct(countproduct);
        String nameprod = "Назва товару";
        String costprod = "Ціна за товар";
        String characterprod = "Характеристика товару";
        String ratingprod = "Рейтинг товару";
        String countprod = "Кількість товару у наявності";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(databaseProducts, true))){
            bw.write(nameprod + " " + costprod + " " + characterprod + " " + ratingprod + " " + countprod);
            bw.newLine();
            bw.write(nameproduct + " " + costproduct + " " + character + " " + rating + " " + countproduct);
            bw.newLine();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int countOfProduct) {
        this.countOfProduct = countOfProduct;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDatabaseProducts() {
        return databaseProducts;
    }

    public void setDatabaseProducts(String databaseProducts) {
        this.databaseProducts = databaseProducts;
    }
}