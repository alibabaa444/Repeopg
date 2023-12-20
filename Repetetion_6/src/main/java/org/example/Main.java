package org.example;
public class Main {
    public static void main(String[] args) {
        Item æble = new Item("Æble", 10);
        Item banan = new Item("Banana", 15);
        Item appelsin = new Item("Orange", 12);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(æble);
        cart.addItem(banan);
        cart.addItem(appelsin);

        System.out.println("Total price before discount: " + cart.getTotalPrice());

        cart.removeItem(banan);

        System.out.println("Total price after removing an item: " + cart.getTotalPrice());

        cart.setDiscount(10);
        System.out.println("Total price with 10% discount: " + cart.getTotalPrice());
    }
}