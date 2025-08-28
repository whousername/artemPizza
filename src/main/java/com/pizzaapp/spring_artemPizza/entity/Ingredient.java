package com.pizzaapp.spring_artemPizza.entity;

public class Ingredient {


    private final int id; 
    private final String name;
    private final String type;
    private final int price;



    //сущность ингредиент 
    public Ingredient(int id, String name, String type, int price)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }


    public int getId(){ return id; } 
    public String getName(){ return name; }
    public String getType() {return type; }
    public int getPrice(){ return price; }
    


    @Override
    public String toString(){
        return name + " (" + price + ")";
    }


}
