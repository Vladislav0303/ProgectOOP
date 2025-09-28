import java.io.File;

public class Site {
    String database = "data.txt";
    String[] communications;
    String baseDataOfRating = "databaseOfProducts.txt";

    public Site() {
        site();
    }

    public void site() {
        // communications - виводимо зв'язки(Твітер, телеграм, Х)
        // Далі в клас клієнт авторизація/реєстрація(Client)
        // Або в клас адмін для авторизації як адмін(Admin)
    }

    public static void main(String[] args) {
        Site s = new Site();
        s.toString();
    }
}
