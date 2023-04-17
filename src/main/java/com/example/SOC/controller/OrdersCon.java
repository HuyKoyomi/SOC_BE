package com.example.SOC.controller;

import com.example.SOC.model.Card;
import com.example.SOC.model.Orders;
import com.example.SOC.respository.CardRes;
import com.example.SOC.respository.OrdersRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")

public class OrdersCon {
    @Autowired
    private OrdersRes res;

    @PostMapping("/orders")
    public Orders createOrders(@RequestBody Orders orders){
        return res.save(orders);
    }

    @PostMapping("/createManyOrders")
    public List<Orders> createManyOrders(@RequestBody List<Orders> orders){
        return res.saveAll(orders);
    }

    @GetMapping("/orders/{id}")
    public Orders getOrdersById(@PathVariable("id") int id){
        Optional<Orders> tmp = res.findById(id);
        return  tmp.get();
    }

    @GetMapping("/getAllOrders")
    public List<Orders> getAllOrders(){
        List<Orders> tmp = res.findAll();
        return  tmp;
    }
}
