public class Saturn extends Currency {

    public Saturn(double totalFunds) {
        super("SaturnSilver", totalFunds);
    }

    public double fromEarthDollars(double EarthDollars) {
        return EarthDollars * SS;
    }

    public double toEarthDollars(double amount) {
        return amount / SS;
    }

    @Override
    public void exchange(Currency other, double amount) {
        if (amount <= getTotalFunds()) {
            System.out.println(
                    "Converting from SaturnSilver to " + other.getCurrencyName() + " and initiating transfer...");
            System.out.println("$" + amount + " SaturnSilver = " + toEarthDollars(amount) + " EarthDollars = $"
                    + other.fromEarthDollars(toEarthDollars(amount)) + " " + other.getCurrencyName());
            System.out.println("SaturnSilver has a total of $" + (getTotalFunds() - amount) + " MarsMoney.");
            System.out.println(other.getClassName() + " has a total of $" + (other.getTotalFunds() - amount)
                    + " " + other.getCurrencyName() + ".");

        } else {
            System.out.println("You don't have enough money!");
        }
    }

};
