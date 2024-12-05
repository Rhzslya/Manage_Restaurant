package com.main;

public abstract class MenuItem {
    private String name;
    private double price;
    private String category;

    public MenuItem(String name, double price, String category) {
        this.name = name.toLowerCase();
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public abstract void tampilMenu();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name + ", Harga: " + price + ", Kategori: " + category;
    }
}
