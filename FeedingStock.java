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

    public void checkStock(AlertService alertService) {
        if (quantityInStock < 100) {
            alertService.sendAlert("Feed stock is low for " + feedType + " (Only " + quantityInStock + "kg left)");
        }
    }

    @Override
    public void displayTrackingInfo() {
        System.out.println("Feed ID: " + stockID + " | Type: " + feedType + " | Quantity: " + quantityInStock + "kg | Supplier: " + supplier);
    }
}
