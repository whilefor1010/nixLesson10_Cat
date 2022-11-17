package org.example;

public abstract class Predator {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private String color;
    private double weight;

    public Predator(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String sleep(){
        return "Hhh-rrr!";
    }

    public String hunt(){
        return "Rrr-rrr!";
    }

}
