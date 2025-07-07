public class Cow extends Animal {
    private String breed;
    private int age;
    private double dailyMilkYield;
    private String healthStatus;

    public Cow(int animalId, String name, String breed, int age, double dailyMilkYield, String healthStatus) {
        super(animalId, name);
        this.breed = breed;
        this.age = age;
        this.dailyMilkYield = dailyMilkYield;
        this.healthStatus = healthStatus;
    }

    public void checkHealthAndMilk(AlertService alertService) {
        if (!healthStatus.equalsIgnoreCase("Healthy")) {
            alertService.sendAlert("Health issue detected in cow " + name + ": " + healthStatus);
        }

        if (dailyMilkYield < 10) {
            alertService.sendAlert("Low milk yield detected for cow " + name + ": " + dailyMilkYield + "L");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Cow ID: " + animalId);
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Milk Yield (L/day): " + dailyMilkYield);
        System.out.println("Health Status: " + healthStatus);
    }
}
