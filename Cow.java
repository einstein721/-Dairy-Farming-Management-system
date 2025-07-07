// Cow.java
public class Cow extends Animal {
    private String breed;
    private int age;
    private double dailyMilkYield;
    private String healthStatus;

    public Cow(int animalId, String name, String breed, int age, double dailyMilkYield, String healthStatus) {
        super(animalId, name); // from Animal
        this.breed = breed;
        this.age = age;
        this.dailyMilkYield = dailyMilkYield;
        this.healthStatus = healthStatus;
    }

    // Getters
    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getDailyMilkYield() {
        return dailyMilkYield;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    // Setters
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDailyMilkYield(double yield) {
        this.dailyMilkYield = yield;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    // Polymorphic behavior (override abstract method)
    @Override
    public void displayDetails() {
        System.out.println("Cow ID: " + animalId);
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Milk Yield (L/day): " + dailyMilkYield);
        System.out.println("Health Status: " + healthStatus);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "ID=" + animalId +
                ", Name='" + name + '\'' +
                ", Breed='" + breed + '\'' +
                ", Age=" + age +
                ", DailyMilkYield=" + dailyMilkYield +
                ", HealthStatus='" + healthStatus + '\'' +
                '}';
    }
}
