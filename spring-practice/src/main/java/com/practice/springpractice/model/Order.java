package com.practice.springpractice.model;

import java.util.List;

public class Order {
    private int totalPrice;
    private String waiter;
    private List<Meal> meals;
    private String seq;

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public Order(String seq, int totalPrice, String waiter, List<Meal> meals) {
        this.seq = seq;
        this.totalPrice = totalPrice;
        this.waiter = waiter;
        this.meals = meals;
    }


}
