import java.util.Scanner;

public class RewardsConverter {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        // Assuming you have a conversion rate, you can pass it to the RewardValue constructor
        double conversionRate = 0.1; // replace with the actual conversion rate
        var rewardsValue = new RewardValue(conversionRate, cashValue);

        System.out.println("Converting $" + input_value + " to miles");
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
