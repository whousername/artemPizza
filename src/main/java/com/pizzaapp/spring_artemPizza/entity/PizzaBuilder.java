package com.pizzaapp.spring_artemPizza.entity;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private Ingredient size;
    private Ingredient dough;
    private Ingredient sauce;
    private List<Ingredient> cheese = new ArrayList<>();
    private List<Ingredient> meat = new ArrayList<>();
    


    public PizzaBuilder setSize(Ingredient size)
    {
        this.size = size;
        return this;
    }

    public PizzaBuilder setDough(Ingredient dough)
    {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setSauce(Ingredient sauce)
    {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder addCheese(Ingredient cheese)
    {
        this.cheese.add(cheese);
        return this;
    }

    public PizzaBuilder addMeat(Ingredient meat)
    {
        this.cheese.add(meat);
        return this;
    }


    public int calculatePrice()
    {
        int sum = 0;
        if (size != null) sum += size.getPrice();
        if (dough != null) sum += dough.getPrice();
        if (sauce != null) sum += sauce.getPrice();
        for (Ingredient ch : cheese) sum += ch.getPrice();
        for (Ingredient me : meat) sum += me.getPrice();
        return sum;
    }
    

    public Ingredient getSize() { return size; }
    public Ingredient getDough() { return dough; }
    public Ingredient getSauce() { return sauce; }
    public List<Ingredient> getCheese() { return cheese; }
    public List<Ingredient> getMeat() { return meat; }

    public Pizza build()
    { 
        return new Pizza(this);
    }
}
