public class Cow extends Animal {
    private String breed;
    private int age;
    private double dailyMilkYield;
    private String healthStatus;

    public void checkHealthAndMilk(AlertService alertService) { ... }

    @Override
    public void displayDetails() { ... }
}
