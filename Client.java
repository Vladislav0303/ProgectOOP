import java.util.Scanner;

public class Client {
    public String nameClient;
    protected String password;
    public Client() {

    }
   public void posibilities() {
        Product pr = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Оберіть що хочете зробити: ");
        System.out.println("1.Додати оцінку товару: ");
        System.out.println("2.Перейти до корзини: ");
        byte chose = sc.nextByte();
        if(chose == 1) {
            pr.changeResponse();
        } else if (chose == 2) {
            pr.takeInBasket();
        } else {
            System.out.println("Не вірне значення!");
            posibilities();
        }
    }
}

