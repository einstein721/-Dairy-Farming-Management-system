public abstract class Animal {
    protected int animalId;
    protected String name;

    public Animal(int animalId, String name) {
        this.animalId = animalId;
        this.name = name;
    }

    public int getAnimalId() {
        return animalId;
    }

    public String getName() {
        return name;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
}
