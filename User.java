import java.util.Scanner;
public class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    public User(String userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void logout() {
        System.out.println("User logged out.");
    }

    public String getUserId() {
        return this.userId;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void displayInfo() {
        System.out.println("User ID: " + this.userId);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Register User ===");
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        User user = new User(userId, name, email, password);
        System.out.println("\n=== Login ===");
        System.out.print("Enter Email: ");
        String loginEmail = scanner.nextLine();
        System.out.print("Enter Password: ");
        String loginPassword = scanner.nextLine();
        if (user.login(loginEmail, loginPassword)) {
            System.out.println("\nLogin successful!");
            user.displayInfo();
            user.logout();
        } else {
            System.out.println("\nLogin failed! Invalid credentials.");
        }

        scanner.close();
    }
}



