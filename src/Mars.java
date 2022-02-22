public class Mars extends Currency {

    public Mars(double totalFunds) throws Exception {
        super("MarsMoney", totalFunds);
        System.out.println();
        System.out.println("Grand Counselor Leera of the Desert requests Charter for the Planetary Bank of Mars...");
        System.out.println("The Government of the United Tribes of the Martian Dunes and Craters hereby grants a charter to the Planetary Bank of Mars headquartered in the Eberswalde Crater...");
        System.out.println("The Planetary Bank of Mars has officially opened on the Eberswalde Crater with a $" + getTotalFunds() + " units of MarsMoney...");
        System.out.println();
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
            System.out.println("$" + amount + " MarsMoney = $" + toEarthDollars(amount) + " EarthDollars = $"
                     + other.fromEarthDollars(toEarthDollars(amount)) + " " + other.getCurrencyName());
            setTotalFunds(getTotalFunds() - amount);
            System.out.println("Mars has a total of $" + (getTotalFunds()) + " MarsMoney.");
            other.setTotalFunds(other.getTotalFunds() + other.fromEarthDollars(toEarthDollars(amount)));
            System.out.println(other.getClassName() + " has a total of $" + other.getTotalFunds()
                    + " " + other.getCurrencyName() + ".");

        } else {
            System.out.println("Uh oh - Mars only has an available balance of $" + getTotalFunds() + ", which is less than $" + amount + "!");
        }
        System.out.println();

    }

};
