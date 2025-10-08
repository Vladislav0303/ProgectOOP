
public class Pay {
    public String Typeofpay;
    private int cost;
    public String typeofbank;

    public Pay() {
        pay();
    }
    void pay() {
        // Користувач обирає тип оплати, обирає банк, сплачує ціну, далі обирає тип доставки
        int cost = getCost();
        System.out.println(cost);
        // Delivery del = new Delivery();
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
