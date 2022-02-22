public class Neptune extends Currency {

    public Neptune(double totalFunds) {
        super("NeptuneNuggets", totalFunds);
        System.out.println();
        System.out.println("The Grand Neptunian Superintelligence has built a new kind of currency called Neptune Nuggets. It currently has a total of $" + getTotalFunds() + " units in circulation...");
        System.out.println("The Digital Bank of Neptune has received charter, succesfully connected to the Interplanetary DataBeam, and is ready to transact with Earthling Financial Institutions...");
        System.out.println();
    }

    public double fromEarthDollars(double EarthDollars) {
        return EarthDollars * NN;
    }

    public double toEarthDollars(double amount) {
        return amount / NN;
    }

    @Override
    public void exchange(Currency other, double amount) {
        System.out.println();
        if (amount <= getTotalFunds()) {
            System.out
                    .println("Converting from NeptuneNuggets to " + other.getCurrencyName() + " and initiating transfer...");
            System.out.println("$" + amount + " NeptuneNuggets = $" + toEarthDollars(amount) + " EarthDollars = $"
                     + other.fromEarthDollars(toEarthDollars(amount)) + " " + other.getCurrencyName());
            setTotalFunds(getTotalFunds() - amount);
            System.out.println("Neptune has a total of $" + (getTotalFunds()) + " NeptuneNuggets.");
            other.setTotalFunds(other.getTotalFunds() + other.fromEarthDollars(toEarthDollars(amount)));
            System.out.println(other.getClassName() + " has a total of $" + other.getTotalFunds()
                    + " " + other.getCurrencyName() + ".");

        } else {
            System.out.println("Uh oh - Neptune only has an available balance of $" + getTotalFunds() + ", which is less than $" + amount + "!");
        }
        System.out.println();

    }

};
