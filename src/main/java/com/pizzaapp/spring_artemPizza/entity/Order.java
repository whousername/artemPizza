package com.pizzaapp.spring_artemPizza.entity;

import java.time.LocalDate;

public class Order {
    


    
    private Long orderNumber;
    private Long userId;
    private LocalDate createdTime;
    private LocalDate expectTime;
    private String items;
    private Status status;


    public enum Status{
        NEW_ORDER,  IN_PROCCESS, IN_THE_KITCHEN, ON_DELIVERY, DONE;
    }







    public Order(Long orderNumber, Long userId, LocalDate createdTime, LocalDate expectTime, String items, Status status){
        this.orderNumber = orderNumber;
        this.userId = userId;
        this.createdTime = createdTime;
        this.expectTime = expectTime;
        this.items = items;
        this.status = status;
    }




    public Long getOrderNumber(){ return orderNumber; }



}
