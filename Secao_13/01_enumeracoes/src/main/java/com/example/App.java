package com.example;

import java.util.Date;

import com.example.entities.Order;
import com.example.entities.enums.OrderStatus;

public class App{
  public static void main( String[] args ){
    Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
    System.out.println(order);
    OrderStatus os1 = OrderStatus.DELIVERED;
    OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
    System.out.println(os1);
    System.out.println(os2);
  }
}
