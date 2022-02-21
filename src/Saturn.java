public class Saturn extends Currency {
    private static String SaturnSilver;

    public Saturn(double totalFunds) {
        super(SaturnSilver, totalFunds);
    }

    public double fromEarthDollars(double EarthDollars) {
        return EarthDollars * SS;
    }

    public double toEarthDollars(double amount) {
        return amount / SS;
    }

};
