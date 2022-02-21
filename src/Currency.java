public abstract class Currency implements Exchangeable {
    private String currencyName;
    private double totalFunds;

    public Currency(String currencyName, double totalFunds) {
        this.currencyName = currencyName;
        this.setTotalFunds(totalFunds);
    }

    public String getClassName() {
        String str = this.getClass().toString();
        return str.replace("class ", "");
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getTotalFunds() {
        return totalFunds;
    }

    public void setTotalFunds(double totalFunds) {
        this.totalFunds = totalFunds;
    }

    public abstract double fromEarthDollars(double EarthDollars);

    public abstract double toEarthDollars(double amount);

}