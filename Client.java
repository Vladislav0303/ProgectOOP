import java.util.Scanner;

public class Client {
    public String nameClient;
    private String password;
    Scanner scanner = new Scanner(System.in);

    public Client() {

    }
    void client() {
        Site s = new Site();
        Admin admin = new Admin();
        System.out.println("Введіть ім'я: ");
        nameClient = scanner.nextLine();
        System.out.println("Введіть пароль: ");
        password = scanner.nextLine();
        s.setDatabase(nameClient + " " + password);
        if(nameClient.equals(admin.NameAdmin)) {
            if(password.equals(admin.getPasswordAdmin())) {
                System.out.println("Ви увійшли як Адмін");
                admin.admin();
            } else {
                System.out.println("Пароль не вірний");
                client();
            }
        } else {
            System.out.println("Ви увійшли у систему");
            Product product = new Product();
            product.product();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
