public class feedingClass {
    public static void main(String[] args) {
        // Create a FeedingStock object
        FeedingStock stock1 = new FeedingStock(101, "Hay", 250.5, "Green Pastures Ltd");

        // Display initial stock information
        stock1.displayStock();

        // Update the quantity
        stock1.setQuantityInStock(300.0);
        System.out.println("\nAfter updating quantity:");

        // Display updated stock
        stock1.displayStock();
    }
}

// FeedingStock class (not public, so it's allowed in same file)
class FeedingStock {
    // Private attributes
    private int stockID;
    private String feedType;
    private double quantityInStock;
    private String supplier;

    // Constructor
    public FeedingStock(int stockID, String feedType, double quantityInStock, String supplier) {
        this.stockID = stockID;
        this.feedType = feedType;
        this.quantityInStock = quantityInStock;
        this.supplier = supplier;
    }

    // Getters
    public int getStockID() {
        return stockID;
    }

    public String getFeedType() {
        return feedType;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public String getSupplier() {
        return supplier;
    }

    // Setters
    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public void setQuantityInStock(double quantityInStock) {
        if (quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    // Method to display stock info
    public void displayStock() {
        System.out.println("Feeding Stock ID: " + stockID);
        System.out.println("Feed Type: " + feedType);
        System.out.println("Quantity in Stock (kg): " + quantityInStock);
        System.out.println("Supplier: " + supplier);
    }
}
