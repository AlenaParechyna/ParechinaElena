package com.senla.model;

import java.time.LocalDate;

public class Maintenance extends AEntity{

    public Maintenance(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private Double price;
    private Long id;

    public Maintenance() {

    }

    public LocalDate getDate() {
        return date;
    }

    private LocalDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Maintenance{" + "id=" + getId() +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
