import java.util.Scanner;

public class Breeding {
    private int breedingId;
    private Cow cow;
    private int inseminatorId;
    private String inseminatorName;
    private String pregnancyStart;
    private int gestationDays;
    private String calvingDate;

    private final int NORMAL_DAYS = 283;

    public Breeding(int breedingId, Cow cow, int inseminatorId, String inseminatorName, String pregnancyStart, int gestationDays, String calvingDate) {
        this.breedingId = breedingId;
        this.cow = cow;
        this.inseminatorId = inseminatorId;
        this.inseminatorName = inseminatorName;
        this.pregnancyStart = pregnancyStart;
        this.gestationDays = gestationDays;
        this.calvingDate = calvingDate;
    }

    public void checkGestationDays() {
        if (gestationDays < NORMAL_DAYS) {
            int daysLeft = NORMAL_DAYS - gestationDays;
            System.out.println(daysLeft + " days left until birth");
        } else if (gestationDays == NORMAL_DAYS) {
            System.out.println("Due soon");
        } else {
            System.out.println("Birth overdue");
        }
    }

    public void showDetails() {
        System.out.println("=== Breeding Record ===");
        System.out.println("Breeding ID: " + breedingId);
        cow.displayDetails();
        System.out.println("Inseminator Name: " + inseminatorName);
        System.out.println("Inseminator ID: " + inseminatorId);
        System.out.println("Pregnancy Start: " + pregnancyStart);
        System.out.println("Gestation Days: " + gestationDays);
        System.out.println("Expected Calving Date: " + calvingDate);
    }
}
