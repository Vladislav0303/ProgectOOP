import java.util.Scanner;

public class Admin {
    protected String NameAdmin = "Vlad";
    private String passwordAdmin = "Vlad123";
    Scanner sc = new Scanner(System.in);

    public Admin() {

    }
    void admin() {
        Site s = new Site();
        s.setDatabase(NameAdmin + " " + passwordAdmin);
//        setCommunications();
//     привілеї адміна
        //String data = getDatabase();
        //System.out.println(data);
        //
        Product pr = new Product();
        System.out.println("Введіть назву товару: ");
        String nameProd = sc.nextLine();
        System.out.println("Введіть ціну на товар: ");
        int costProd = sc.nextInt();
        System.out.println("Введіть характеристику товару: ");
        Scanner sc1 = new Scanner(System.in);
        String characteristic = sc1.nextLine();
        System.out.println("Введіть кількість товару який є в наявності: ");
        int countOfProduct = sc.nextInt();
        System.out.println("Введіть оцінку товару: ");
        int rating = sc.nextInt();
        pr.aboutOfProduct(nameProd, costProd, characteristic, countOfProduct, rating);
        //
        //Delivery del = new Delivery();
//        це буде зберагітися в обазу даних
//        del.getTypeofdelivery();
//        del.getTypeofcountry();
//        del.getRegion();
        Sklad sklad = new Sklad();
//        sklad.setNumOfSklad();
//        sklad.setIsavailability();
//        sklad.setCountOfTovar();
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }
}
