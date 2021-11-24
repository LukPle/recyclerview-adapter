package com.example.recyclerview_adapter;

/**
 * The class represents a single item.
 */
public class Item {

    private String item;
    private String quantity;

    /**
     * Constructor that sets values for the variables.
     * @param item is the term for the item.
     * @param quantity is the quantity of the item.
     */
    public Item(String item, String quantity) {

        this.item = item;
        this.quantity = quantity;
    }

    public String getItem() {

        return item;
    }

    public String getQuantity() {

        return quantity;
    }
}
