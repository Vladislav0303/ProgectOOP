
public class Sklad {
    private String numOfSklad;
    private Boolean isavailability;
    private int[] countOfProduct;

    public Sklad() {
        sklad();
    }
    void sklad() {
        // Користувач вказує склад numOfSklad, а далі йому виводиться успішно офорлмене замовлення, це замовлення записується
        // в базу даних
        // Адмін може корегувати в наявності товар чи ні isavailability, та скільки цього товару на складі countOfTovar.
//       String nameOfSklad = getNumOfSklad();
//       Boolean isavailability =getIsavailability();
//       int[] countOfproduct = getCountOfProduct();
//        виводимо це на екран користувача
    }

    public String getNumOfSklad() {
        return numOfSklad;
    }

    public void setNumOfSklad(String numOfSklad) {
        this.numOfSklad = numOfSklad;
    }

    public Boolean getIsavailability() {
        return isavailability;
    }

    public void setIsavailability(Boolean isavailability) {
        this.isavailability = isavailability;
    }

    public int[] getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int[] countOfProduct) {
        this.countOfProduct = countOfProduct;
    }
}
