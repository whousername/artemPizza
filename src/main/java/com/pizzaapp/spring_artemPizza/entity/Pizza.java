package com.pizzaapp.spring_artemPizza.entity;

import java.util.List;

public class Pizza {


    //ссылки на объекты и списки Ingredient 
    private final Ingredient size;
    private final Ingredient dough; 
    private final Ingredient sauce;
    private final List<Ingredient> cheese; 
    private final List<Ingredient> meat;
    private final  int totalPrice;



    //default конструктор для билдера 
    Pizza(PizzaBuilder builder)
    {
        this.size = builder.getSize();
        this.dough = builder.getDough();
        this.sauce = builder.getSauce();
        this.cheese  = builder.getCheese();
        this.meat = builder.getMeat();
        this.totalPrice = builder.calculatePrice();
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    @Override 
    public String toString(){
        return "Pizza{" +
                "size = " + size +
                ", dough = " + dough +
                ", sauce = " + sauce +
                ", cheese = " + cheese +
                ", meat = " + meat +
                ", total price = " + totalPrice +
                "}";
    }




}

