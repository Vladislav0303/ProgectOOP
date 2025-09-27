import java.io.*;

public class Product {
    String nameProduct;
    int countOfProduct;
    int cost;
    String characteristic;
    int rating;

    public Product() {
//        адмін може змінювати ці змінні
//        ці значення будуть по дефолту стояти, і виводитися користувачу, потім він зможе вибрати той чи інший товар
    }
    // якщо користувач захоче поставити оцінку
        public void resp() {
            Response rsp = new Response();
            System.out.println(rsp);
        }
        // коли користувач обрав що хоче купити
        public void basket() {
//        Basket bs = new Basket();
//        bs.basket(nameProduct(ці змінні будуть мати значення), countOfProduct(ці також));
//        Приклад - bs.basket("Планшет" , 10, 5000);
        }
    }