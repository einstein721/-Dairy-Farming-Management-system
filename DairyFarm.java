import java.util.Scanner;

public class DairyFarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === User Login ===
        User user = new User("88IO2", "Frank", "frank@gmail.com", "password");

        System.out.print("Enter Email: ");
        String inputEmail = scanner.nextLine();

        System.out.print("Enter Password: ");
        String inputPassword = scanner.nextLine();

        if (!user.login(inputEmail, inputPassword)) {
            System.out.println("Invalid login credentials.");
            return; // Exit if login fails
        }

        System.out.println("Login successful! Welcome, " + user.getName());

        // === Cow Object ===
        Cow cow = new Cow(113, "Bessie", "Jersey", 4, 34.5, "Healthy");
        cow.displayDetails();  // Show cow info

        // === Breeding Object ===
        Breeding breeding = new Breeding(
                101,  // breedingId
                cow,
                401,  // inseminatorId
                "Frank",  // inseminatorName
                "11th January",
                325,
                "11th October"
        );
        System.out.println("\n--- Breeding Info ---");
        breeding.showDetails();
        breeding.checkGestationDays();

        // === Feeding Stock Object ===
        FeedingStock feedingStock = new FeedingStock(
                305,
                "Hay",
                230,
                "Fresh Milk Org"
        );

        System.out.println("\n--- Feeding Stock ---");
        feedingStock.displayTrackingInfo();

        // === Logout ===
        user.logout();
        scanner.close();
    }
}
