package com.example.oopsection2;

public class Animal {

    private String name;
    private String color;
    private int legs;
    private boolean hasTail;

    public Animal(String name, String color, int legs, boolean hasTail) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTail = hasTail;
    }

    //type 1 polymorphosm "create a constructor with diffrent arguments"
    public Animal(String name, String color, int legs) {
        this.name = name;
        this.color = color;
        this.legs = legs;
    }

    public void eat(String food){
        System.out.println("Eating " + food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
