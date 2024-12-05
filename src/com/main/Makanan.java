package com.main;

public class Makanan extends MenuItem {
    public Makanan(String name, double price) {
        super(name, price, "Makanan");
    }

    @Override
    public void tampilMenu() {
        System.out.println(Utils.capitalizeFirst(getName()) + " - " + Utils.formatIDR(getPrice()));
    }
}
