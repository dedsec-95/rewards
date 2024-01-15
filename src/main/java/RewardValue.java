public class RewardValue {

    private double cashValue;
    private int milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = calculateMilesValue(cashValue);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = calculateCashValue(milesValue);
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Helper method to calculate miles value from cash value
    private int calculateMilesValue(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    // Helper method to calculate cash value from miles value
    private double calculateCashValue(int milesValue) {
        return milesValue * 0.0035;
    }
}
