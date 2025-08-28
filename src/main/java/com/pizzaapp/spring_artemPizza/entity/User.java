package com.pizzaapp.spring_artemPizza.entity;

import java.time.LocalDate;

public class User {


    //FIELDS
    private Long id; //логика получения id
    private String role;  //логика получения роли?
    private String name;
    private String number;
    private String adress;
    //private PaymentWay paymentWay; //??

    private String email;
    private String password;
    private LocalDate createdAt;   // логика присваения даты создания акка







    //конструктор объекта 
    public User (Long id, String role, String name, String number, String adress, String email, String password, LocalDate createdAt){
        this.id = id;
        this.role = role;
        this.name = name;
        this.number = number;
        this.adress = adress;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
    }


     

    // GETTERS / SETTERS
    public Long getId(){ return id;}
        

    //...







}
