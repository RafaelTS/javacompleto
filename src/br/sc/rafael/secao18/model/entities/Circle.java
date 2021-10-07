package br.sc.rafael.secao18.model.entities;

import br.sc.rafael.secao18.model.enums.Color;

public class Circle extends AbstractShape{

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
