package com.practice.springpractice.service;

import com.practice.springpractice.model.Meal;
import com.practice.springpractice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Order_Service {

    List<Order> orderList = new ArrayList<>();
    List<Meal> mealList = new ArrayList<>();
    int sum = 0;

    public Order_Service() {

        this.mealList.add(new Meal("Hamburger", 500, "taste good"));
        this.mealList.add(new Meal("Sandwich", 200, "taste bad"));

        this.orderList.add(new Order("1", 700, "A", this.mealList));
        this.orderList.add(new Order("2", 1400, "B", this.mealList));
        this.orderList.add(new Order("3", 2100, "C", this.mealList));
    }

    public Order getOrderBySeq(String seq) {

        for (Order order : this.orderList) {
            if (order.getSeq().equals(seq)) {
                return order;
            }
        }
        return null;
    }

    public Order calTotalPrice() {
        if (!this.orderList.get(this.orderList.size() - 1).getSeq().equals("all")) {
            this.orderList.add(new Order("all", 0, "all", this.mealList));

            for (Order order : orderList) {
                this.sum += order.getTotalPrice();
            }
            this.orderList.get(this.orderList.size() - 1).setTotalPrice(sum);
        }
        return this.orderList.get(this.orderList.size() - 1);

    }
}


