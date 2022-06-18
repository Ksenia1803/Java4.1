public class Main {
    //public static void main(String[] args) {
       // int price = 65852;
       // int mile = price / 20;
       // System.out.println("Бонусные мили =" + mile);

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }

}
