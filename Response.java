public class Response {
    public String NameClient;
    public String commentary;
    public int rating;

    public Response() {
        responce();
        Product pr = new Product();
        System.out.println(pr);
    }
    void responce() {
        // вводимо в базу даних нік користувача оцінку та коментар на той товар який він обрав оцінити, буде база даних за якими
        Site s = new Site();
        s.setDatabase(NameClient + " " + commentary + " " + rating);
        // адмін зможе скорегувати через середнє арифметичне значення всіх оцінок та скорегувати оцінку(буде ще одна база даних)
        // повертаємося назад
    }
}
