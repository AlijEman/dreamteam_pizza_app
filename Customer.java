package com.example.dreamteam_pizza_app;

import java.util.ArrayList;

public class Customer {

    int asuID;
    String emailAddress;
    ArrayList<PizzaOrder> pizzaOrder = new ArrayList<PizzaOrder>();

  void addPizzaOrder(PizzaOrder pizzaOrder) {
//create arraylist of pizzaorders and add pizzaorder to arraylist
      pizzaOrder.add(pizzaOrder);
  }

    boolean validateStudentASU_ID(){
        if (asuID > 100000000 && asuID < 999999999) {
            return true;
        }else {
            return false;
        }
    }

    void sendOrderFinishedEmail(){
        //send email to customer that their order is ready for pickup
        String email = asuID + "@asu.edu";
        String subject = "Your order is ready for pickup";
    }

    }


