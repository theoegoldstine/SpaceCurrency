public class Mars extends Currency {

    public Mars(double totalFunds) {
        super("MarsMoney", totalFunds);
    }

    public double fromEarthDollars(double EarthDollars) {
        return EarthDollars * MM;
    }

    public double toEarthDollars(double amount) {
        return amount / MM;
    }

    @Override
    public void exchange(Currency other, double amount) {
        System.out.println();
        if (amount <= getTotalFunds()) {
            System.out
                    .println("Converting from MarsMoney to " + other.getCurrencyName() + " and initiating transfer...");
            System.out.println("$" + amount + " MarsMoney = " + toEarthDollars(amount) + " EarthDollars = $"
                    + other.getCurrencyName() + " " + other.fromEarthDollars(toEarthDollars(amount)));
            System.out.println("Mars has a total of $" + (getTotalFunds() - amount) + " MarsMoney.");
            other.setTotalFunds(getTotalFunds() + other.fromEarthDollars(toEarthDollars(amount)));
            System.out.println(other.getClassName() + " has a total of $" + other.getTotalFunds()
                    + " " + other.getCurrencyName() + ".");

        } else {
            System.out.println("You don't have enough money!");
        }
        System.out.println();
    }

};
