import java.util.Scanner;

public class DairyFarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlertService alertService = new ConsoleAlertService();

        // User login
        User user = new User("88IO2", "Frank", "frank@gmail.com", "password");

        System.out.print("Enter Email: ");
        String inputEmail = scanner.nextLine();
        System.out.print("Enter Password: ");
        String inputPassword = scanner.nextLine();

        if (!user.login(inputEmail, inputPassword)) {
            System.out.println("Invalid login credentials.");
            return;
        }

        System.out.println("Login successful! Welcome, " + user.getName());

        // Cow
        Cow cow = new Cow(113, "Bessie", "Jersey", 4, 6.8, "Injured leg");
        cow.displayDetails();
        cow.checkHealthAndMilk(alertService); // Cow alert

        // Breeding
        Breeding breeding = new Breeding(101, cow, 401, "Frank", "11th January", 325, "11th October", alertService);
        breeding.showDetails();
        breeding.checkGestationDays(); // Breeding alert

        // Feeding Stock
        FeedingStock feedingStock = new FeedingStock(305, "Hay", 70, "Fresh Milk Org");
        feedingStock.displayTrackingInfo();
        feedingStock.checkStock(alertService); // Feed alert

        user.logout();
        scanner.close();
    }
}
