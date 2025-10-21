
public class Site {
    private String database = "data.txt";
    private String[] communications;

    public Site() {

    }

    void site() {
        System.out.print("Discord " + "Twitch " + "YouTube " + "Telegram " + "X" + "\n");
        Client cl = new Client();
        cl.client();
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

    public String[] getCommunications() {
        return communications;
    }

    public void setCommunications(String[] communications) {
        this.communications = communications;
    }
}
