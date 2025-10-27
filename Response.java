import java.io.*;
import java.util.Scanner;

public class Response extends Product {
    public String commentary;
    public byte rating;
    protected String databaseOfComm = "databaseOfComm.txt";

    public Response() {

    }
    public void product() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println(getNameProduct());
        System.out.println("Оберіть товар на який хочете поставити оцінку та залишити коментар: ");
        byte prod = scanner.nextByte();
        if(prod == 1) {
            System.out.println("Ви обрали додати коментар до Iphone X");
        System.out.println("Введіть коментар: ");
        commentary = sc.nextLine();
        System.out.println("Поставте оцінку(0/10): ");
        rating = sc1.nextByte();
        System.out.println("Ваш коментар: " + commentary + " Ваша оцінка: " + rating);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(databaseOfComm, true))){
                bw.newLine();
                bw.write("Товар: Iphone X " + "Коментар: " + commentary + " Рейтинг товару: " + rating + "\n");
                bw.newLine();
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if(prod == 2) {
            System.out.println("Ви обрали додати коментар до Ipad 4");
            System.out.println("Введіть коментар: ");
            commentary = sc.nextLine();
            System.out.println("Поставте оцінку(0/10): ");
            rating = sc1.nextByte();
            System.out.println("Ваш коментар: " + commentary + " Ваша оцінка: " + rating);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(databaseOfComm, true))){
                bw.newLine();
                bw.write("Товар: Ipad 4 " + "Коментар: " + commentary + " Рейтинг товару: " + rating + "\n");
                bw.newLine();
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if(prod == 3) {
            System.out.println("Ви обрали додати коментар до Samsung S24");
            System.out.println("Введіть коментар: ");
            commentary = sc.nextLine();
            System.out.println("Поставте оцінку(0/10): ");
            rating = sc1.nextByte();
            System.out.println("Ваш коментар: " + commentary + " Ваша оцінка: " + rating);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(databaseOfComm, true))){
                bw.newLine();
                bw.write("Товар: Samsung S24 " + "Коментар: " + commentary + " Рейтинг товару: " + rating + "\n");
                bw.newLine();
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if(prod == 4) {
            System.out.println("Ви обрали додати коментар до Oppo A53(хуета редкостная)");
            System.out.println("Введіть коментар: ");
            commentary = sc.nextLine();
            System.out.println("Поставте оцінку(0/10): ");
            rating = sc1.nextByte();
            System.out.println("Ваш коментар: " + commentary + " Ваша оцінка: " + rating);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(databaseOfComm, true))){
                bw.newLine();
                bw.write("Товар: Oppo A53 " + "Коментар: " + commentary + " Рейтинг товару: " + rating + "\n");
                bw.newLine();
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Такого продукту немає!");
        }
    }
    public void checkComm() {
        try (BufferedReader br = new BufferedReader(new FileReader(databaseOfComm))){
            String ln;
            while ((ln = br.readLine()) != null) {
                System.out.println(ln);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
