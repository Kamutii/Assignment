public class VacationCostCalculator {

    // Method to calculate total cost
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        // Sample data
        double accommodation = 850.25;
        double meals = 350.50;
        double activities = 250.00;

        // Method call
        double totalCost = calculateTotalCost(accommodation, meals, activities);

        // Display result
        System.out.println("Total Vacation Cost: $" + totalCost);
    }
}
