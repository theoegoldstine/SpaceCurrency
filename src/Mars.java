public class Mars extends Currency {
    private static String MarsMoney;

    public Mars(double totalFunds) {
        super(MarsMoney, totalFunds);
    }

    public double fromEarthDollars(double EarthDollars) {
        return EarthDollars * MM;
    }

    public double toEarthDollars(double amount) {
        return amount / MM;
    }

    @Override
    public void exchange(Currency other, double amount) {
        double ;
    }

    

};
