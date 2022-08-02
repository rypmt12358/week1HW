package com.practice.springpractice.service;

import com.practice.springpractice.model.Meal;
import com.practice.springpractice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Meal_Service {

    List<Meal>  mealList;

    public Meal_Service(){
        this.mealList=new ArrayList<>();
        this.mealList.add(new Meal("Hamburger",500,"taste good"));
        this.mealList.add(new Meal("Sandwich",200,"taste bad"));
    }

    public Meal getMealByName(String name){
        for(int i = 0;i<this.mealList.size();i++){
            if(this.mealList.get(i).getName().toLowerCase().equals(name.toLowerCase()))
                return this.mealList.get(i);
        }
        return null;
    }




}
