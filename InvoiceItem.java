public class InvoiceItem {
     String id;
     String description;
     int quantity;
     double unitPrice;

    // The Constructor
    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
   

    // Setter methods
    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
     public double getTotal() {
        return quantity * unitPrice;
    }


    // toString method to display the invoice item details
    @Override
    public String toString() {
        return "Id is :" + id + "\n" +
               "Description is: " + description + "\n" +
               "Quantity is: " + quantity + "\n" +
               "UnitPrice is: " + unitPrice + "\n" +
               "Total is: " + getTotal() + "\n";
    }
}
