public class RewardValue {

    private final double conversionRate;
    private final double cashValue;
    private final int milesValue;

    // Constructor for cash value
    public RewardValue(double conversionRate, double cashValue) {
        this.conversionRate = conversionRate;
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.conversionRate = 0.1; // replace with the actual conversion rate
        this.cashValue = convertMilesToCash(milesValue);
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    // Helper method to convert cash value to miles
    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue * conversionRate);
    }

    // Helper method to convert miles value to cash
    private double convertMilesToCash(int milesValue) {
        return milesValue / conversionRate;
    }
}
