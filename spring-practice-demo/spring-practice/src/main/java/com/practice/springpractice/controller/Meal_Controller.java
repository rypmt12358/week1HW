package com.practice.springpractice.controller;

import com.practice.springpractice.model.Meal;
import com.practice.springpractice.service.Meal_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Meal_Controller {
    @Autowired
    Meal_Service meal_service;


    @GetMapping("/meal")
    public String getMealByName(@RequestParam String name, Model model){
        Meal meal=this.meal_service.getMealByName(name);
        model.addAttribute("meal",meal);
        return "meal";
    }



}
