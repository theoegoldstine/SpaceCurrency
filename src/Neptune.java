public class Neptune extends Currency {
    private static String NeptuneNuggets;

    public Neptune(double totalFunds) {
        super(NeptuneNuggets, totalFunds);
    }

    public double fromEarthDollars(double EarthDollars) {
        return EarthDollars * NN;
    }

    public double toEarthDollars(double amount) {
        return amount / NN;
    }

};
