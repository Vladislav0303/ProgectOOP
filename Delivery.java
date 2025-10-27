import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Delivery {
    private String typeofdelivery;
    private String typeofcountry;
    private String region;
    private String databaseOfDelivery = "databaseOfDelivery.txt";

    public Delivery() {

    }
    public void delivery() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(databaseOfDelivery, true))){
        Scanner sc = new Scanner(System.in);
        byte chose = sc.nextByte();
        System.out.println("Оберіть тип доставки: ");
        System.out.println("1.Самовивіз.");
        System.out.println("2.Пошта.");
        if(chose == 1) {
            typeofdelivery = "Ви обрали самовивіз.";
            System.out.println(typeofdelivery);
            System.out.println("Введіть назву країни: ");
            typeofcountry = sc.nextLine();
            System.out.println("Введіть регіон куди доставити: ");
            region = sc.nextLine();
            System.out.println("Введіть адресу куди доставити: ");
            String adress = sc.nextLine();
            System.out.println(typeofdelivery + "\nВаш регіон: " + region + "\nВаша адреса: " + adress);
                bw.write("Тип доставки: " + typeofdelivery + " Назва країни: " + typeofcountry + " Регіон:" + region + " Адреса: " + adress);
                bw.newLine();
        } else if (chose == 2) {
            typeofdelivery = "Ви обрали поштою.";
            System.out.println(typeofdelivery);
            System.out.println("Введіть назву країни: ");
            typeofcountry = sc.nextLine();
            System.out.println("Введіть регіон куди доставити: ");
            region = sc.nextLine();
            System.out.println("Введіть адресу куди доставити: ");
            String adress = sc.nextLine();
            System.out.println(typeofdelivery + "\nВаш регіон: " + region + "\nВаша адреса: " + adress);
                bw.write("Тип доставки: " + typeofdelivery + " Назва країни: " + typeofcountry + " Регіон:" + region + " Адреса: " + adress);
                bw.newLine();
            Sklad sk = new Sklad();
            sk.infosklad();
        }
    } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getTypeofdelivery() {
        return typeofdelivery;
    }

    public void setTypeofdelivery(String typeofdelivery) {
        this.typeofdelivery = typeofdelivery;
    }

    public String getTypeofcountry() {
        return typeofcountry;
    }

    public void setTypeofcountry(String typeofcountry) {
        this.typeofcountry = typeofcountry;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDatabaseOfDelivery() {
        return databaseOfDelivery;
    }

    public void setDatabaseOfDelivery(String databaseOfDelivery) {
        this.databaseOfDelivery = databaseOfDelivery;
    }
}
