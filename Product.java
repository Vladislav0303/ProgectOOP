import java.io.*;
import java.util.Scanner;

public class Product {
    protected String nameProduct = "1.Iphone X\n" + "2.Ipad 4\n" + "3.Samsung S24\n" + "4.Oppo A53";
    protected int countOfProduct;
    protected int cost;
    protected String characteristic;
    protected byte rating;
    private String databaseProducts = "test.txt";

    public Product() {

    }
    public void product() {
        Client cl = new Client();
        Scanner sc = new Scanner(System.in);
        Scanner chose = new Scanner(System.in);
        System.out.println("Виберіть товар: ");
        byte prod = sc.nextByte();
        if(prod == 1) {
            System.out.println("Ви обрали: Iphone X");
                countOfProduct = 15;
                cost = 15000;
                characteristic = "3000 mAh, 4/64 GB";
                rating = 6;
                System.out.println("В наявності: " + countOfProduct + "\nЦіна: " + cost + "\nХарактеристика: " + characteristic + "\nОцінка товару: " + rating + " ");
            System.out.println("Хочете повернутися до назад до товарів: ");
            if(chose.nextLine().equals("Так")) {
                product();
            } else {
                cl.posibilities();
            }
            } else if (prod == 2) {
            countOfProduct = 10;
            cost = 35000;
            characteristic = "4000 mAh, 4/64 GB";
            rating = 7;
            System.out.println("В наявності: " + countOfProduct + "\nЦіна: " + cost + "\nХарактеристика: " + characteristic + "\nОцінка товару: " + rating + " ");
            System.out.println("Хочете повернутися до назад до товарів: ");
            if(chose.nextLine().equals("Так")) {
                product();
            } else {
                cl.posibilities();
            }
        } else if (prod == 3) {
            countOfProduct = 7;
            cost = 66000;
            characteristic = "5500 mAh, 4/64 GB";
            rating = 8;
            System.out.println("В наявності: " + countOfProduct + "\nЦіна: " + cost + "\nХарактеристика: " + characteristic + "\nОцінка товару: " + rating + " ");
            System.out.println("Хочете повернутися до назад до товарів: ");
            if(chose.nextLine().equals("Так")) {
                product();
            } else {
                cl.posibilities();
            }
        } else if (prod == 4) {
            countOfProduct = 4;
            cost = 5000;
            characteristic = "4000 mAh, 4/64 GB";
            rating = 1;
            System.out.println("В наявності: " + countOfProduct + "\nЦіна: " + cost + "\nХарактеристика: " + characteristic + "\nОцінка товару: " + rating + " ");
            System.out.println("Хочете повернутися до назад до товарів: ");
            if(chose.nextLine().equals("Так")) {
                product();
            } else {
                cl.posibilities();
            }
        } else {
            System.out.println("Такого продукту немає!");
        }
    }
    public void changeResponse() {
        Response rsp = new Response();
                rsp.product();
    }
    public void takeInBasket() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Ви вже вибрали що хочете купити?: ");
            String chose1 = sc.nextLine();
            if(chose1.equals("Так")) {
                Basket bs = new Basket();
                bs.basket();
            }
        }
    public void aboutOfProduct(String nameproduct, int costproduct, String character, byte rating, int countproduct) {
        setNameProduct(nameproduct);
        setCost(costproduct);
        setCharacteristic(character);
        setRating(rating);
        setCountOfProduct(countproduct);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(databaseProducts, true))){
            bw.newLine();
            bw.write("Назва товару: " + nameproduct + "\nЦіна за товар: " + costproduct + "\nХарактеристика товару: " + character + "\nРейтинг товару: " + rating + "\nКількість товару у наявності: " + countproduct);
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

    public double getCost() {
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

    public void setRating(byte rating) {
        this.rating = rating;
    }

    public String getDatabaseProducts() {
        return databaseProducts;
    }

    public void setDatabaseProducts(String databaseProducts) {
        this.databaseProducts = databaseProducts;
    }
}