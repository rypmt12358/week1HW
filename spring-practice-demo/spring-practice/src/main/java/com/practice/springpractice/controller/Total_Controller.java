package com.practice.springpractice.controller;

import com.practice.springpractice.model.Order;
import com.practice.springpractice.service.Order_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Console;

@Controller
public class Total_Controller {

    @Autowired
    Order_Service orderService ;
    @GetMapping("/total")
    public String getTotal( Model model){
        Order total =this.orderService.calTotalPrice();
        model.addAttribute("total", total);
        // return值必須和html的檔名相同，
        // 如 file 的名稱為 user.html 時， return 值為 "user"
        return "total";
    }
}
