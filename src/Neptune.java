public class Neptune extends Currency {

    public Neptune(double totalFunds) {
        super("NeptuneNuggets", totalFunds);
    }

    public double fromEarthDollars(double EarthDollars) {
        return EarthDollars * NN;
    }

    public double toEarthDollars(double amount) {
        return amount / NN;
    }

    @Override
    public void exchange(Currency other, double amount) {
        if (amount <= getTotalFunds()) {
            System.out.println(
                    "Converting from NeptuneNuggets to " + other.getCurrencyName() + " and initiating transfer...");
            System.out.println("$" + amount + " NeptuneNuggets = " + toEarthDollars(amount) + " EarthDollars = $"
                    + other.getCurrencyName() + " " + other.fromEarthDollars(toEarthDollars(amount)));
            System.out.println("NeptuneNuggets has a total of $" + (getTotalFunds() - amount) + " MarsMoney.");
            System.out.println(other.getClassName() + " has a total of $" + (other.getTotalFunds() - amount)
                    + " " + other.getCurrencyName() + ".");

        } else {
            System.out.println("You don't have enough money!");
        }
    }

};
