

public class Product {
    private String nameProduct;
    private int countOfProduct;
    private int cost;
    private String characteristic;
    private int rating;

    public Product() {
        product();
    }
    // якщо користувач захоче поставити оцінку
        void resp() {
            Response rsp = new Response();
            System.out.println(rsp);
        }
        // коли користувач обрав що хоче купити
        void basket() {
//        Basket bs = new Basket();
//        bs.basket(nameProduct(ці змінні будуть мати значення), countOfProduct(ці також), cost);
//        Приклад - bs.basket("Планшет" , 10, 5000);
        }

        void product() {
        String nameproduct = getNameProduct();
        int costproduct = getCost();
        String chatacter = getCharacteristic();
        int rating = getRating();
        int countproduct = getCountOfProduct();
//      вивід продуктів на екран
        }
    void aboutOfProduct() {
//        pr.setNameProduct();
//        pr.setCost();
//        pr.setCharacteristic();
//        pr.setRating();
//        pr.setCountOfProduct();
    }
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int countOfProduct) {
        this.countOfProduct = countOfProduct;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}