public class SpaceCurrency {
    public static void main(String[] args) throws Exception {
        Currency mars = new Mars(100.00);
        System.out.println(mars.fromEarthDollars(10));
    }
}
