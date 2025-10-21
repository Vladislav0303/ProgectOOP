
public class Delivery {
    private String typeofdelivery;
    private String typeofcountry;
    private String region;

    public Delivery() {
        delivery();
        String typeofdelivery = getTypeofdelivery();
        String typeofcountry = getTypeofdelivery();
        String region = getRegion();
        System.out.println(typeofcountry + " " +  typeofdelivery + " " + region);
    }
    void delivery() {
        // вказує тип доставки typeofdelivery, вказує країну typeofcountry, регіон region.
//        setTypeofdelivery();
//        setTypeofcountry();
//        setRegion();
        // далі переходить до складу, а саме вказує його
        // Sklad sklad = new Sklad();
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
}
