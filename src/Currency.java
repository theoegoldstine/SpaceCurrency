public abstract class Currency implements Exchangeable {
    private String currencyName;
    private double totalFunds;


    public Currency(String currencyName, double totalFunds) {
        this.currencyName = currencyName;
        this.setTotalFunds(totalFunds);
    }
    
    public double getTotalFunds() {
        return totalFunds;
    }

    public void setTotalFunds(double totalFunds) {
        this.totalFunds = totalFunds;
    }


    public abstract double fromEarthDollars (double EarthDollars);
    public abstract double toEarthDollars (double amount);

}