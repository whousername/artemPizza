package com.pizzaapp.spring_artemPizza.service;

import java.util.ArrayList;
import java.util.List;

import com.pizzaapp.spring_artemPizza.entity.Order;

public class OrderService {
    

    private List<Order> orders = new ArrayList<>();



    //нужен ли объект сервиса? 
    public OrderService(){
    }



    public void createOrder()
    {
        //чтобы создать заказ и добавить его в лист нужен: пользователь, товар, цена 

        //проверка авторизации
        //собираем цену 
        //создаем заказ, сохраняем в бд через репозиторий 
    }

    
//>Class OrderService:

//- List Orders
//+ createOrder();
//+ getOrderById();
//+ updateOrderStatus();




}
