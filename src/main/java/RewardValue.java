public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = calculateMilesValue(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = calculateCashValue(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    private int calculateMilesValue(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    private double calculateCashValue(int milesValue) {
        return milesValue * 0.0035;
    }
}
