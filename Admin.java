import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Admin extends Site {
    protected String NameAdmin = "Vlad";
    private String passwordAdmin = "Vlad123";

    public Admin() {

    }
    public void posibilities() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Виберіть що хочете зробити?: ");
        System.out.println("1.Записати товар у базу даних товарів.");
        System.out.println("2.Всі товари.");
        System.out.println("3.База даних клієнтів.");
        System.out.println("4.Переглянути базу даних товарів.");
        System.out.println("5.Переглянути базу даних коментарів.");
        System.out.println("6.Записати у базу даних про товар на складі.");
        int chose = sc.nextInt();
        if(chose == 1) {
            Product pr = new Product();
            System.out.println("Введіть назву товару: ");
            String nameprod = sc.nextLine();
            System.out.println("Введіть ціну продукту: ");
            int costproduct = sc1.nextInt();
            System.out.println("Введіть характеристику товару: ");
            String character = sc.nextLine();
            System.out.println("Введіть оцінку товару: ");
            byte rating = sc.nextByte();
            System.out.println("Введіть кількість у наявності");
            int countproduct = sc.nextInt();
            pr.aboutOfProduct(nameprod,costproduct, character, rating, countproduct);
        } else if (chose == 2) {
            Product pr = new Product();
            pr.product();
        } else if (chose == 3) {
            checkdatabaseOfClients();
        } else if (chose == 4) {
            aboutOfProduct();
        } else if (chose == 5) {
            Response response = new Response();
            response.checkComm();
        } else if (chose == 6) {
            Sklad sk = new Sklad();
            sk.entersklad();
        }
    }
    public void aboutOfProduct() {
        Product pr = new Product();
        try (BufferedReader br = new BufferedReader(new FileReader(pr.getDatabaseProducts()))){
            String ln;
            while ((ln = br.readLine()) != null) {
                System.out.println(ln);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
        //
        //Delivery del = new Delivery();
//        це буде зберігатися в базу даних
//        del.getTypeofdelivery();
//        del.getTypeofcountry();
//        del.getRegion();
//        Sklad sklad = new Sklad();
//        sklad.setNumOfSklad();
//        sklad.setIsavailability();
//        sklad.setCountOfTovar();
    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }
}
