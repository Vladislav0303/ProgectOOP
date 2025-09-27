public class Response {
    String NameClient;
    String commentary = "Good";
    int rating;

    public Response() {
        // вводимо в базу даних нік користувача оцінку та коментар на той товар який він обрав оцінити, буде база даних за якими
        // адмін зможе скорегувати через середнє арифметичне значення всіх оцінок та скорегувати оцінку(буде ще одна база даних)
        // повертаємося назад
        Product pr = new Product();
        System.out.println(pr);
    }
}
