package br.sc.rafael.secao20.entities;

public class MyFunctionProduct {

    private String name;
    private Double price;

    public MyFunctionProduct() {
    }

    public MyFunctionProduct(String name, Double price) {
        this.name = name;
        this.price = price;
    }

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
        return name + ", " + String.format("%.2f", price);
    }
}
