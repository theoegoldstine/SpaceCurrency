public class Saturn extends Currency {

    public Saturn(double totalFunds) {
        super("SaturnSilver", totalFunds);
        System.out.println();
        System.out.println("The Lord of the Rings has ordered the implementation of a planetwide blockchain with its native cryptocurrency known as Silver...");
        System.out.println("A total of $" + getTotalFunds() + " units of Saturn Silver have been mined...");
        System.out.println();
    }

    public double fromEarthDollars(double EarthDollars) {
        return EarthDollars * SS;
    }

    public double toEarthDollars(double amount) {
        return amount / SS;
    }

    @Override
    public void exchange(Currency other, double amount) {
        System.out.println();
        if (amount <= getTotalFunds()) {
            System.out
                    .println("Converting from SaturnSilver to " + other.getCurrencyName() + " and initiating transfer...");
            System.out.println("$" + amount + " SaturnSilver = $" + toEarthDollars(amount) + " EarthDollars = $"
                     + other.fromEarthDollars(toEarthDollars(amount)) + " " + other.getCurrencyName());
            setTotalFunds(getTotalFunds() - amount);
            System.out.println("Saturn has a total of $" + (getTotalFunds()) + " SaturnSilver.");
            other.setTotalFunds(other.getTotalFunds() + other.fromEarthDollars(toEarthDollars(amount)));
            System.out.println(other.getClassName() + " has a total of $" + other.getTotalFunds()
                    + " " + other.getCurrencyName() + ".");

        } else {
            System.out.println("Uh oh - Saturn only has an available balance of $" + getTotalFunds() + ", which is less than $" + amount + "!");
        }
        System.out.println();

    }

};
