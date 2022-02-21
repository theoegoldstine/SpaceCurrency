public interface Exchangeable {
    
    public static final double ED = 1.00;
    public static final double MM = 1.30;
    public static final double SS = 0.87;
    public static final double NN = 2.00;

    public void exchange(Currency other, double amount);

}
