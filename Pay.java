import java.util.Scanner;

public class Pay extends Basket{
    public String Typeofpay;
    private double cost;
    public String typeofbank;
    private double persant = 1.20;

    public Pay() {

    }
    public void pay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть тип оплати:");
        System.out.println("1.Оплата карткою.");
        System.out.println("2.Оплата готівкою.");
        byte chose = sc.nextByte();
        if(chose == 1) {
            Typeofpay = "Ви обрали оплата карткою";
            System.out.println(Typeofpay);
            System.out.println("Оберіть тип банку, яким будете розраховуватися: ");
            typeofbank = sc.nextLine();
            System.out.println(typeofbank);
            cost = costofProduct * persant;
            System.out.println("З урахуванням зборів та комісій: " + cost);
            Delivery del = new Delivery();
            del.delivery();
        } else if (chose == 2) {
            Typeofpay = "Ви обрали оплата готівкою";
            System.out.println(Typeofpay);
            Delivery del = new Delivery();
            del.delivery();
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
