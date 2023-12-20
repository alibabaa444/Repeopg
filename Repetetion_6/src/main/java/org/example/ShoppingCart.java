package org.example;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Item> itemList;
    private double discount;

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : itemList) {
            totalPrice += item.getPrice();
        }
        if (discount > 0) {
            totalPrice -= totalPrice * (discount / 100.0);
        }
        return totalPrice;
    }

    public List<Item> getItems() {
        return itemList;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
