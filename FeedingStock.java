public class FeedingStock implements Trackable {
    private int stockID;
    private String feedType;
    private double quantityInStock;
    private String supplier;

    public FeedingStock(int stockID, String feedType, double quantityInStock, String supplier) {
        this.stockID = stockID;
        this.feedType = feedType;
        this.quantityInStock = quantityInStock;
        this.supplier = supplier;
    }

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

    public void setQuantityInStock(double quantityInStock) {
        if (quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public void displayTrackingInfo() {
        System.out.println("Feed ID: " + stockID + " | Type: " + feedType + " | Quantity: " + quantityInStock + "kg | Supplier: " + supplier);
    }
}
