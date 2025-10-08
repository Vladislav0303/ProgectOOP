public class Admin {
    public String NameAdmin;
    private String password;

    public Admin() {
        admin();
    }
    void admin() {
     Site site = new Site();
        site.setDatabase(NameAdmin + " " + password);
//     привілеї адміна
        String data = site.getDatabase();
        System.out.println(data);
        Product pr = new Product();
        pr.aboutOfProduct();
        Delivery del = new Delivery();
//        це буде зберагітися в обазу даних
//        del.getTypeofdelivery();
//        del.getTypeofcountry();
//        del.getRegion();
        Sklad sklad = new Sklad();
//        sklad.setNumOfSklad();
//        sklad.setIsavailability();
//        sklad.setCountOfTovar();
    }
}
