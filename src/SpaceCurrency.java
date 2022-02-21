public class SpaceCurrency {
    public static void main(String[] args) throws Exception {

        Currency mars = new Mars(100.00);
        Currency neptune = new Neptune(100.00);
        Currency saturn = new Saturn(100.00);
        
        System.out.println("<-- Exchanges -->");

        mars.exchange(saturn, 25.00);
        neptune.exchange(saturn, 10.00);
        saturn.exchange(mars, 122.00);
        saturn.exchange(mars, 121.00);
    }
}
