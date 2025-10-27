import java.io.*;
import java.util.Scanner;

public class Sklad {
    private String nameOfSklad;
    private Boolean isavailability;
    protected int countOfProduct;
    private String databaseOfSklad = "databaseOfSklad.txt";

    public Sklad() {

    }
    public void infosklad() {
        try (BufferedReader br = new BufferedReader(new FileReader(databaseOfSklad))){
            String ln;
            while ((ln = br.readLine()) != null) {
                System.out.println(ln);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void entersklad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вкажіть склад: ");
        nameOfSklad = sc.nextLine();
        System.out.println("Вкажіть чи прибув товар на склад чи ні: ");
        isavailability = sc.hasNext("Так, Ні");
        System.out.println("Введіть кількість товару на складі: ");
        countOfProduct = sc.nextInt();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(databaseOfSklad, true))){
            bw.newLine();
            bw.write("Склад: " + nameOfSklad + "Статус прибуття: " + isavailability + "Кількість товару на складі: " + countOfProduct);
            bw.newLine();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNameOfSklad() {
        return nameOfSklad;
    }

    public void setNameOfSklad(String numOfSklad) {
        this.nameOfSklad = numOfSklad;
    }

    public Boolean getIsavailability() {
        return isavailability;
    }

    public void setIsavailability(Boolean isavailability) {
        this.isavailability = isavailability;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int countOfProduct) {
        this.countOfProduct = countOfProduct;
    }
}
