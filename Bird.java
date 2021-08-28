package com.example.oopsection2;

public class Bird extends Animal{

    private int wings;

    public Bird(String name, String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
        //the super is setting all the values to the fields of our animal
    }

    //press ctrl+o
    @Override//type 2 polymorphism "overriding a method"
    public void eat(String food) {
        super.eat(food);
        System.out.println(this.getName() + "Eating finished");
    }

    //type 3 polymorphism "using methods with the same way in diffrent ways"
    public void fly(){
        System.out.println(this.getName()+" is flying");
    }

    public void fly(int speed){
    }

    public void fly(String name){

    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
