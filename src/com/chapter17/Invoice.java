package com.chapter17;

public class Invoice {
    private String partNumber;
    private double pricePerItem;
    private String pathDescription;
    private int quantity;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public String getPathDescription() {
        return pathDescription;
    }

    public void setPathDescription(String pathDescription) {
        this.pathDescription = pathDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
