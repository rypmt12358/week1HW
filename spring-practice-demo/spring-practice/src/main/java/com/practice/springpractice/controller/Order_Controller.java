package com.practice.springpractice.controller;

import com.practice.springpractice.model.Order;
import com.practice.springpractice.service.Order_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Console;

@Controller
//@RequestMapping(value = "/order")
public class Order_Controller {
    @Autowired
    Order_Service orderService ;
    int total;
    @GetMapping("/order/{seq}")
    public String getOrderBySeq(@PathVariable String seq , Model model) {
        Order order = this.orderService.getOrderBySeq(seq);
        model.addAttribute("order", order);
        return "order";
    }



}
