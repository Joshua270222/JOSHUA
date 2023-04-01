package com.example.pertemuan3.model;

public class MenuItem {
    private String name;
    private int price;
    private int image;

    public MenuItem(String name, int price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}

