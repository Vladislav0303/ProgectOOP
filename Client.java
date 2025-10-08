public class Client {
    public String nameClient;
    private String password;

    public Client() {
        client();
    }
    void client() {
   Site s = new Site();
   s.setDatabase(nameClient + " " + password);
//    я буду записувати BufferedWriter/BufferedRider
//    s.database = "Логін користувача: " + nameClient + " Пароль: " + password;
//    після того, як зареєструвалися, авторизуємося тобто робимо рекурсію методу
        s.site();
//    далі клас Product
        Product product = new Product();
    }
}
