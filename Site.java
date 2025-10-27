import java.io.*;
import java.util.Scanner;


public class Site {
    private String database = "c.txt";
    private String communications = "Discord " + "Twitch " + "YouTube " + "Telegram " + "X" + "\n";

    public Site() {

    }
    public void site() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Оберіть що хочете зробити: ");
        System.out.println("1.registation");
        System.out.println("2.autorizationOnSite: ");
        byte chose = sc.nextByte();
        if(chose == 1) {
            registrationOnSite();
        } else {
            autorizationOnSite();
        }
}
    public void autorizationOnSite() {
        Client cl = new Client();
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
            System.out.print(getCommunications());
            System.out.println("Введіть ім'я: ");
            cl.nameClient = scanner.nextLine();
            System.out.println("Введіть пароль: ");
            cl.password = sc.nextLine();
            /*if(cl.password.equals(ln)) {
                Product pr = new Product();
                pr.allproducts();
            } else {
                System.out.println("Не вірний пароль!");
                autorizationOnSite();
            }*/
            }
    public void registrationOnSite() {
        Client cl = new Client();
        Admin admin = new Admin();
        String[][] str = new String[1][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я: ");
        cl.nameClient = scanner.nextLine();
        System.out.println("Введіть пароль: ");
        cl.password = scanner.nextLine();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
            str[i][j] = cl.nameClient + " " + cl.password;
                System.out.println(str[i][j]);
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(database, true))){
            bw.write(cl.nameClient + " " + cl.password + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        setDatabase(cl.nameClient + " " + cl.password);
        if(cl.nameClient.equals(admin.NameAdmin)) {
            if(cl.password.equals(admin.getPasswordAdmin())) {
                System.out.println("Ви увійшли як Адмін");
                admin.posibilities();
            } else {
                System.out.println("Пароль не вірний");
                autorizationOnSite();
            }
        }
    }
    public void checkdatabaseOfClients() {
        try (BufferedReader br = new BufferedReader(new FileReader(database))){
            String ln;
            while ((ln = br.readLine()) != null) {
                System.out.println(ln);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Site s = new Site();
        s.site();
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getCommunications() {
        return communications;
    }

    public void setCommunications(String communications) {
        this.communications = communications;
    }
}
