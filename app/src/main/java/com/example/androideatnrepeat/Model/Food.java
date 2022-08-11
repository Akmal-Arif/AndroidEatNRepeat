package com.example.androideatnrepeat.Model;

public class Food {
    private String Name;
    private String Image;
    private String Price;
    private String Description;
    private String Discount;
    private String MenuId;

    public Food() {
    }

    public Food(String name, String image, String price, String description, String discount, String menuID) {
        Name = name;
        Image = image;
        Price = price;
        Description = description;
        Discount = discount;
        MenuId = menuID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getMenuID() {
        return MenuId;
    }

    public void setMenuID(String menuID) {
        MenuId = menuID;
    }
}
