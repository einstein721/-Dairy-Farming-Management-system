import java.util.ArrayList;
public class COW {
    private int cowID;
    private String cowName;
    private int cowAge;
    private String cowBreed;
    private double cowWeight;
    private String healthStatus;
    private double milkYield;
    private int breedingID;

    public COW(int cowID,String cowName,int cowAge,String cowBreed,double cowWeight,String healthStatus,double milkYield,int breedingID){
        this.cowID=cowID;
        this.cowName=cowName;
        this.cowAge=cowAge;
        this.cowBreed=cowBreed;
        this.cowWeight=cowWeight;
        this.healthStatus=healthStatus;
        this.milkYield=milkYield;
        this.breedingID=breedingID;
    }
    

    public int getCowID() { return cowID; }
    public void setCowID(int cowID) { this.cowID = cowID; }

    public String getCowName() { return cowName; }
    public void setCowName(String cowName) { this.cowName = cowName; }

    public int getCowAge() { return cowAge; }
    public void setCowAge(int cowAge) { this.cowAge = cowAge; }

    public String getCowBreed() { return cowBreed; }
    public void setCowBreed(String cowBreed) { this.cowBreed = cowBreed; }

    public double getCowWeight() { return cowWeight; }
    public void setCowWeight(double cowWeight) { this.cowWeight = cowWeight; }

    public String getHealthStatus() { return healthStatus; }
    public void setHealthStatus(String healthStatus) { this.healthStatus = healthStatus; }

    public double getMilkYield() { return milkYield; }
    public void setMilkYield(double milkYield) { this.milkYield = milkYield; }

    public int getBreedingID() { return breedingID; }
    public void setBreedingID(int breedingID) { this.breedingID = breedingID; }
   
    public boolean isHealthy() {
        return "Healthy".equalsIgnoreCase(healthStatus);
    }
    private static ArrayList<COW>
    COWList = new ArrayList<>();

    public static void addCow(COW cow){
        COWList.add(cow);
    }

    public static void removeCow(int cowID){
        COWList.removeIf(cid -> cid.cowID == cowID);
    }
    public static COW getcow(int cowID){
        for (COW cid : COWList){
            if(cid.cowID == cowID) return cid;

        }
        return null;

    }

    public static void listCows(){
        for (COW cid : COWList){
        System.out.println("Cow ID: " + cid.cowID);
        System.out.println("Name: " + cid.cowName);
        System.out.println("Age: " + cid.cowAge + " years");
        System.out.println("Breed: " + cid.cowBreed);
        System.out.println("Weight: " + cid.cowWeight + " kg");
        System.out.println("Milk Yield: " + cid.milkYield + " lt");
        System.out.println("Health: " + cid.healthStatus);
        

        }
    }


     public static void main(String[] args){

    }
}

