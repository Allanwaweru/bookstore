import java.util.Random;

public class restaurant {
    public static void main(String[] args) {
        // Define the menu items and their prices
        String[] menu = {
            "Appetizer 1", "Appetizer 2", "Appetizer 3", "Appetizer 4", "Appetizer 5",
            "Entree 1", "Entree 2", "Entree 3", "Entree 4", "Entree 5",
            "Dessert 1", "Dessert 2", "Dessert 3", "Dessert 4", "Dessert 5"
        };

        double[] prices = {3.00, 4.99, 2.99, 3.50, 4.50, 5.99, 6.99, 8.59, 6.20, 3.65, 4.99, 6.49, 4.49, 8.49, 5.49};

        // Arrays to track the number of times each item is ordered
        int[] orderCount = new int[menu.length];
        double totalSales = 0.0;

        Random random = new Random();

        // Generate 20 random orders
        for (int i = 0; i < 20; i++) {
            int menuItemIndex = random.nextInt(menu.length);
            orderCount[menuItemIndex]++; // Increase the count for the selected item
            totalSales += prices[menuItemIndex]; // Add the price to total sales
        }

        // Display the summary
        System.out.println("---- Summary ----");
        System.out.println("Total money made: $" + totalSales);

        for (int i = 0; i < menu.length; i++) {
            // Calculate the percentage of sales for each item
            double percentage = (orderCount[i] * prices[i] / totalSales) * 100;
            System.out.println(menu[i] + ": " + orderCount[i] + " orders, " + percentage + "% of sales");
        }
    }
}
