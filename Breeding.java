public class Breeding {
    private int breedingId;
    private Cow cow;
    private int inseminatorId;
    private String inseminatorName;
    private String pregnancyStart;
    private int gestationDays;
    private String calvingDate;
    private final int NORMAL_DAYS = 283;

    private AlertService alertService;

    public Breeding(int breedingId, Cow cow, int inseminatorId, String inseminatorName,
                    String pregnancyStart, int gestationDays, String calvingDate, AlertService alertService) {
        this.breedingId = breedingId;
        this.cow = cow;
        this.inseminatorId = inseminatorId;
        this.inseminatorName = inseminatorName;
        this.pregnancyStart = pregnancyStart;
        this.gestationDays = gestationDays;
        this.calvingDate = calvingDate;
        this.alertService = alertService;
    }

    public void checkGestationDays() {
        if (gestationDays < NORMAL_DAYS) {
            int daysLeft = NORMAL_DAYS - gestationDays;
            alertService.sendAlert(daysLeft + " days left until birth for " + cow.getName());
        } else if (gestationDays == NORMAL_DAYS) {
            alertService.sendAlert("Cow " + cow.getName() + " is due to give birth today!");
        } else {
            alertService.sendAlert("Birth overdue for cow " + cow.getName());
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
