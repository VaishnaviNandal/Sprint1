package com.mobile.entity;

import javax.persistence.*;

@Entity
@Table(name = "mobiles")

public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mobileId;
    
    private String mobileName;
    private String brand;
    private String color;
    private String model;
    private double price;
    private String specifications;



    public Mobile() {}

    public Mobile(String mobileName, String brand, String color, String model, double price, String specifications) {
        this.mobileName = mobileName;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.price = price;
        this.specifications = specifications;
    }

    // Getters and Setters
    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileId=" + mobileId +
                ", mobileName='" + mobileName + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", specifications='" + specifications + '\'' +
                '}';
    }
}