//ASSIGNMENT2-Q2. Create a class called Invoice that a hardware store might use to represent an invoice for an item 
//sold at the store. An Invoice should include four pieces of information as fields—a part number 
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a 
//price per item (double). Your class should have a constructor 
//that initializes the four instance variables. Provide a set and a get method for each instance variable. 
/calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the 
//amount as a double value. 
//If the quantity is not positive, it should be set to 0. 
//If the price per item is not positive, it should be set to 0.0. 
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities. 

package com.aiml;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem =pricePerItem;
    }
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}


//Display
package com.aiml;

public class InvoiceTest {
    public static void main(String[] args) {
        // Create Invoice object
        Invoice inv = new Invoice("P101", "Hammer", 5, 450.0);

        // Display invoice details
        System.out.println("Part Number       : " + inv.getPartNumber());
        System.out.println("Part Description  : " + inv.getPartDescription());
        System.out.println("Quantity              : " + inv.getQuantity());
        System.out.println("Price per Item      : ₹" + inv.getPricePerItem());
        System.out.println("Invoice Amount    : ₹" + inv.getInvoiceAmount());
    }
}
