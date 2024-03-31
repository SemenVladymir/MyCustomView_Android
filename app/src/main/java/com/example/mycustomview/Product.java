package com.example.mycustomview;

public class Product {
    int Image;
    String Description;
    String Cost;

    public Product(int image, String description, String cost) {
        Image = image;
        Description = description;
        Cost = cost;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }
}
