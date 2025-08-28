package com.pizzaapp.spring_artemPizza.repository;

import java.util.ArrayList;
import java.util.List;

import com.pizzaapp.spring_artemPizza.entity.Ingredient;

public class IngredientsStorage {
    
     //temporarry ingredients storage instead DB
    private final List<Ingredient> dough = new ArrayList<>();
    {
        dough.add(new Ingredient(01,"Thin", "dough", 100));
        dough.add(new Ingredient(02,"Classic", "dough", 80));
        dough.add(new Ingredient(03,"Big", "dough", 120));
    }

    private final List<Ingredient> sauce = new ArrayList<>();
    {
        sauce.add(new Ingredient(01,"Tomato", "sause", 50));
        sauce.add(new Ingredient(02,"Hot Sause", "sause", 30));
        sauce.add(new Ingredient(03,"Provance", "sause", 40));
    }

    private final List<Ingredient> meat = new ArrayList<>();
    {
        meat.add(new Ingredient(01,"Smoked Chicken", "meat", 80));
        meat.add(new Ingredient(02,"Smoked Bacon", "meat", 100));
        meat.add(new Ingredient(03,"Angus Beef", "meat", 150));
        meat.add(new Ingredient(04,"Minced Pork", "meat", 90));
        meat.add(new Ingredient(05,"Hamon", "meat", 120));
        meat.add(new Ingredient(06,"Salami", "meat", 110));
    }


    private final List<Ingredient> cheese = new ArrayList<>();
    {
        cheese.add(new Ingredient(01,"Mozarella", "cheese", 70));
        cheese.add(new Ingredient(02,"Parmesan", "cheese", 100));
        cheese.add(new Ingredient(03,"DorBlue", "cheese", 120));
        cheese.add(new Ingredient(04,"Cheddar", "cheese", 90));
    }


    private final List<Ingredient> size = new ArrayList<>();
    {
        size.add(new Ingredient(01,"S", "size",100));
        size.add(new Ingredient(02,"M", "size",200));
        size.add(new Ingredient(03,"L", "size", 400));
        size.add(new Ingredient(04,"XL", "size", 500));
    }



    public List<Ingredient> getDough() { return dough; }
    public List<Ingredient> getSause() { return sauce; }
    public List<Ingredient> getMeat() { return meat; }
    public List<Ingredient> getCheese() { return cheese; }
    public List<Ingredient> getSize() { return size; }
  

}
