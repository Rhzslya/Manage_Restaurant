package com.main;

public class Minuman extends MenuItem {
    public Minuman(String name, double price) {
        super(name, price, "Minuman");
    }

    @Override
    public void tampilMenu() {
        System.out.println(Utils.capitalizeFirst(getName()) + " - " + Utils.formatIDR(getPrice()));
    }
}
