

public class Site {
    private String database = "data.txt";
    private String[] communications;

    public Site() {
        site();
    }

    void site() {
        // communications - виводимо зв'язки(Твітер, телеграм, Х)
        // Далі в клас клієнт авторизація/реєстрація(Client)
        // Або в клас адмін для авторизації як адмін(Admin)
    }

    public static void main(String[] args) {
        Site s = new Site();
        s.toString();
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String[] getCommunications() {
        return communications;
    }

    public void setCommunications(String[] communications) {
        this.communications = communications;
    }
}
